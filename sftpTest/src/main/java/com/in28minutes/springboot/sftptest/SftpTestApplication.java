package com.in28minutes.springboot.sftptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class SftpTestApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SftpTestApplication.class, args);

        String HOST = "10.100.0.105";
        int PORT = 22;
        String USER_NAME = "leopard2";
        String PASSWORD = "FireTiger2021!";
        String REMOTE_DIR = "/home/leopard2/test/";
        String LOCAL_DIR = "/home/leopard2/upload/";

        String localFile = LOCAL_DIR + "send.txt";
        String remoteFile = REMOTE_DIR + "received.txt";
        String localLinkedFile = LOCAL_DIR + "send_link.txt";
        String remoteLinkedFile = REMOTE_DIR + "received_link.txt";

        System.out.println("linked file create start -------------");


        Path link =  Paths.get(LOCAL_DIR,  "send_link.txt");
        System.out.println("linked file name : " + link.getFileName().toString());
        if (Files.exists(link)) {
            Files.delete(link);
        }
        // 링크파일 생성
        Path filePath =  Paths.get(LOCAL_DIR,  "send.txt");
        System.out.println("original file name : " + filePath.getFileName().toString());
        Files.createSymbolicLink(link,  filePath);

        System.out.println("linked file create end -------------");

        System.out.println("sftp start -------------");

        SftpUtil sftpUtil = new SftpUtil(HOST, PORT, USER_NAME, PASSWORD, "");

        System.out.println("sftpUtil.putFile : localFile " + localFile );
        System.out.println("sftpUtil.putFile : remoteFile " + remoteFile);
        sftpUtil.putFile(localFile, remoteFile);
        System.out.println("sftpUtil.putFile : localLinkedFile " + localLinkedFile );
        System.out.println("sftpUtil.putFile : remoteLinkedFile " + remoteLinkedFile);
        sftpUtil.putFile(localLinkedFile, remoteLinkedFile);
        System.out.println("sftpUtil.putFile ----------");

        List<String> filelist = sftpUtil.listFiles(REMOTE_DIR, "");
        for (String file : filelist) {
            System.out.println(file);
        }
        System.out.println("sftpUtil.listFiles ----------");

        localFile = localFile + ".received";
        System.out.println("sftpUtil.getFile : remoteFile " + remoteFile);
        System.out.println("sftpUtil.getFile : localFile " + localFile );
        sftpUtil.getFile(remoteFile, localFile);
        System.out.println("sftpUtil.getFile ----------");



        sftpUtil.close();
    }

}
