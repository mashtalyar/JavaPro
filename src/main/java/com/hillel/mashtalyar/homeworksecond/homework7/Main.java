package com.hillel.mashtalyar.homeworksecond.homework7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static String path = "src/main/java/com/hillel/mashtalyar/homeworksecond/recources/texts/text.txt";
    public static String pathToLoginsAndPass = "src/main/java/com/hillel/mashtalyar/homeworksecond/recources/texts/users.txt";

    public static void main(String[] args) throws IOException {
        String verse = "Я помню чудное мгновенье:\n" +
                "Передо мной явилась ты,\n" +
                "Как мимолётное виденье,\n" +
                "Как гений чистой красоты.";
        writeWithCreatingFolder(verse);
        read(path);
        registration(pathToLoginsAndPass);
        login(pathToLoginsAndPass);
    }

    private static String createDirectory() throws IOException {

        final Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        return path;
    }
    private static void write(final String login, String password, String pathToLoginsAndPass)  {
        try (final FileWriter fileWriter = new FileWriter(pathToLoginsAndPass)) {
            fileWriter.write( login + "\n" + password + "\n");
        } catch (IOException exception) {
            System.err.println("Error with FileWriter");
        }
    }
    private static void writeWithCreatingFolder(final String text) throws IOException {
        final String path = createDirectory();
        try (final FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(text);
        } catch (IOException exception) {
            System.err.println("Error with FileWriter");
        } finally {
            System.out.println("Record completed");
        }
    }

    private static void read(String path) throws IOException {
        try (final FileReader fileReader = new FileReader(path);
             Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
    private static void registration(String path) {
            Scanner scanner = new Scanner(System.in);
            String passFirst;
            String passSecond;
            String login;
        System.out.println("Registration");
            System.out.println("Enter your Login:");
            login = scanner.nextLine();
            System.out.println("Your login:" + login);
            System.out.println("Enter your password:");
            passFirst = scanner.nextLine();
            System.out.println("Enter your password again:");
            passSecond = scanner.nextLine();
            if (passFirst.equals(passSecond)) {
                write(login, passFirst, path);
                System.out.println("Record completed");
            } else {
                System.out.println("Passwords are not the same");
                System.exit(00);
            }
        }
    private static void login(String path) {
        int attempt=3;
        String inputLogin;
        String inputPass;
        String loginFromFile;
        String passFromFile;
        try (
                final FileReader fileReader = new FileReader(path);final Scanner scannerRead = new Scanner(fileReader);Scanner scannerInput = new Scanner(System.in);
        ) {
            System.out.println("Authentication");
        loginFromFile = scannerRead.nextLine();
        passFromFile=scannerRead.nextLine();
        while(true){
            attempt--;
            System.out.println("Enter your login");
            inputLogin = scannerInput.nextLine();
            System.out.println("you input login:" + inputLogin);
            System.out.println("Enter your password");
            inputPass=scannerInput.nextLine();
            System.out.println("You input password:"+inputPass);
            if(inputLogin.equals(loginFromFile)&&inputPass.equals(passFromFile)){
                System.out.println("Hello, "+inputLogin+"!");
                break;
            }else {
                System.out.println("Try again");
            }
            if(attempt==0){
                System.out.println("Try later");
                break;
            }
        }
        } catch (IOException exception) {
            System.err.println("Error with File");
        }
    }
}
