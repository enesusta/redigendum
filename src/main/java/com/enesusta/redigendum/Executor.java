package com.enesusta.redigendum;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Executor {

    public Executor() {

    }

    /*
    public execute() {
        public void executeCommand(String link) {

            String line;
            String resultTat = "";

            ArrayList<String> arguments = new ArrayList<String>();
            String youtube =
                    "https://www.youtube.com/playlist?list=PLz1xsfxsHsPjqh1pq-lB454OhUVcQLM6v";
            //  arguments.add("/bin/bash");
            arguments.add("cmd.exe");
            arguments.add("-/c");
            //     arguments.add("C:\\Users\\Enes\\Desktop\\JPomodoro\\youtube-dl.exe -x -o '~/Desktop/playlist/%(title)s.%(ext)s' "+link);
            arguments.add("C:\\Users\\Enes\\Desktop\\JPomodoro\\youtube-dl.exe" +
                    // " 'C:\\Users\\Enes\\Desktop\\playlist\\%(title)s.%(ext)s' " +
                    " --yes-playlist --extract-audio --audio-format mp3 --audio-quality 0 "+link);

//        arguments.add("avconv -i source.mp4 -s 1920x1080 output.mp4");

            String file = System.getProperty("user.home")+ File.separator+"Desktop"+File.separator+"deneme.txt";

            try(PrintStream os  = new PrintStream
                    (new FileOutputStream(new File(file)))
            ) {


                Input2.setCaretPosition(0);
                try {
                    ProcessBuilder builder;
                    StringBuilder sb = new StringBuilder();

                    builder = new ProcessBuilder(arguments);
                    builder.redirectErrorStream(true);

                    Process process = builder.start();

                    InputStream is = process.getInputStream();

                    InputStreamReader isr = new InputStreamReader(is);

                    BufferedReader br = new BufferedReader(isr);

                    String str;
                    byte counter=0;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                        Input2.append(line + System.getProperty("line.separator"));
                        Input2.update(Input2.getGraphics());
                    }

                    Input2.setCaretPosition(Input2.getDocument().getLength());

                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e);
                }





            }catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }


        }
    }
    */

}
