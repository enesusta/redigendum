package com.enesusta.redigendum.executor;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public final class DefaultExecutorService implements ExecutorService {

    @Override
    public final void execute(final String remoteLink) {

        List<String> list = new ArrayList<>();
        list.add("cmd.exe");
        list.add("-/c");
        list.add("youtube-dl.exe --yes-playlist --extract-audio --audio-format mp3 --audio-quality 0 " + remoteLink);

        try {

            ProcessBuilder builder = new ProcessBuilder(list);
            builder.redirectErrorStream(true);
            Process process = builder.start();

            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            final Pattern pattern = Pattern.compile("\\d+\\.\\d%");
            String str;
            byte counter = (byte) 0;
            while ((str = br.readLine()) != null) {

                Matcher matcher = pattern.matcher(str);
                while (matcher.find())
                    System.out.println(matcher.group());

                System.out.println(str);
            }

        } catch (IOException e) {

        }

    }
}
