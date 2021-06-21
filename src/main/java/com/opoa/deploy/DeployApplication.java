package com.opoa.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author opoa
 */
@SpringBootApplication
public class DeployApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeployApplication.class, args);
        System.out.println(" ________  ________  ________  ________     \n" +
                "|\\   __  \\|\\   __  \\|\\   __  \\|\\   __  \\    \n" +
                "\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\|\\  \\   \n" +
                " \\ \\  \\\\\\  \\ \\   ____\\ \\  \\\\\\  \\ \\   __  \\  \n" +
                "  \\ \\  \\\\\\  \\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\ \\  \\ \n" +
                "   \\ \\_______\\ \\__\\    \\ \\_______\\ \\__\\ \\__\\\n" +
                "    \\|_______|\\|__|     \\|_______|\\|__|\\|__|\n");
        System.out.println("启动成功(≧∇≦)ﾉ");
    }

}
