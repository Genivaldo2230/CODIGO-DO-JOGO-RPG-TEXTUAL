package com.mycompany.jogorpggda;
//chave do projeto git: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

import com.mycompany.jogorpggda.PlayOn;

public class Menu {
    public static void main(String[] args) {
        System.out.println("\n\n" +
                "                         _______   ________  ______   ______   __    __   ______                                                \n" +
                "                        /       \\ /        |/      | /      \\ /  \\  /  | /      \\                                               \n" +
                "                        $$$$$$$  |$$$$$$$$/ $$$$$$/ /$$$$$$  |$$  \\ $$ |/$$$$$$  |                                              \n" +
                "                        $$ |__$$ |$$ |__      $$ |  $$ | _$$/ $$$  \\$$ |$$ \\__$$/                                               \n" +
                "                        $$    $$< $$    |     $$ |  $$ |/    |$$$$  $$ |$$      \\                                               \n" +
                "                        $$$$$$$  |$$$$$/      $$ |  $$ |$$$$ |$$ $$ $$ | $$$$$$  |                                              \n" +
                "                        $$ |  $$ |$$ |_____  _$$ |_ $$ \\__$$ |$$ |$$$$ |/  \\__$$ |                                              \n" +
                "                        $$ |  $$ |$$       |/ $$   |$$    $$/ $$ | $$$ |$$    $$/                                               \n" +
                "                        $$/   $$/ $$$$$$$$/ $$$$$$/  $$$$$$/  $$/   $$/  $$$$$$/                                                \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                            ______   ________                                                                   \n" +
                "                                           /      \\ /        |                                                                  \n" +
                "                                          /$$$$$$  |$$$$$$$$/                                                                   \n" +
                "                                          $$ |  $$ |$$ |__                                                                      \n" +
                "                                          $$ |  $$ |$$    |                                                                     \n" +
                "                                          $$ |  $$ |$$$$$/                                                                      \n" +
                "                                          $$ \\__$$ |$$ |                                                                        \n" +
                "                                          $$    $$/ $$ |                                                                        \n" +
                "                                           $$$$$$/  $$/                                                                         \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                     ________  __    __  ________                                                               \n" +
                "                                    /        |/  |  /  |/        |                                                              \n" +
                "                                    $$$$$$$$/ $$ |  $$ |$$$$$$$$/                                                               \n" +
                "                                       $$ |   $$ |__$$ |$$ |__                                                                  \n" +
                "                                       $$ |   $$    $$ |$$    |                                                                 \n" +
                "                                       $$ |   $$$$$$$$ |$$$$$/                                                                  \n" +
                "                                       $$ |   $$ |  $$ |$$ |_____                                                               \n" +
                "                                       $$ |   $$ |  $$ |$$       |                                                              \n" +
                "                                       $$/    $$/   $$/ $$$$$$$$/                                                               \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                               __     __  ______  __    __  ______  __    __   ______    ______                                 \n" +
                "                              /  |   /  |/      |/  |  /  |/      |/  \\  /  | /      \\  /      \\                                \n" +
                "                              $$ |   $$ |$$$$$$/ $$ | /$$/ $$$$$$/ $$  \\ $$ |/$$$$$$  |/$$$$$$  |                               \n" +
                "                              $$ |   $$ |  $$ |  $$ |/$$/    $$ |  $$$  \\$$ |$$ | _$$/ $$ \\__$$/                                \n" +
                "                              $$  \\ /$$/   $$ |  $$  $$<     $$ |  $$$$  $$ |$$ |/    |$$      \\                                \n" +
                "                               $$  /$$/    $$ |  $$$$$  \\    $$ |  $$ $$ $$ |$$ |$$$$ | $$$$$$  |                               \n" +
                "                                $$ $$/    _$$ |_ $$ |$$  \\  _$$ |_ $$ |$$$$ |$$ \\__$$ |/  \\__$$ |                               \n" +
                "                                 $$$/    / $$   |$$ | $$  |/ $$   |$$ | $$$ |$$    $$/ $$    $$/                                \n" +
                "                                  $/     $$$$$$/ $$/   $$/ $$$$$$/ $$/   $$/  $$$$$$/   $$$$$$/                                 \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                   __       __   ______   _______   _______   ______   ______   _______    ______                               \n" +
                "                  /  |  _  /  | /      \\ /       \\ /       \\ /      | /      \\ /       \\  /      \\                              \n" +
                "                  $$ | / \\ $$ |/$$$$$$  |$$$$$$$  |$$$$$$$  |$$$$$$/ /$$$$$$  |$$$$$$$  |/$$$$$$  |                             \n" +
                "                  $$ |/$  \\$$ |$$ |__$$ |$$ |__$$ |$$ |__$$ |  $$ |  $$ |  $$ |$$ |__$$ |$$ \\__$$/                              \n" +
                "                  $$ /$$$  $$ |$$    $$ |$$    $$< $$    $$<   $$ |  $$ |  $$ |$$    $$< $$      \\                              \n" +
                "                  $$ $$/$$ $$ |$$$$$$$$ |$$$$$$$  |$$$$$$$  |  $$ |  $$ |  $$ |$$$$$$$  | $$$$$$  |                             \n" +
                "                  $$$$/  $$$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ | _$$ |_ $$ \\__$$ |$$ |  $$ |/  \\__$$ |                             \n" +
                "                  $$$/    $$$ |$$ |  $$ |$$ |  $$ |$$ |  $$ |/ $$   |$$    $$/ $$ |  $$ |$$    $$/                              \n" +
                "                  $$/      $$/ $$/   $$/ $$/   $$/ $$/   $$/ $$$$$$/  $$$$$$/  $$/   $$/  $$$$$$/                               \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "                                                                                                                                \n" +
                "  ______                                   __                      _______   __                                  __  __   __    \n" +
                " /      \\                                 /  |                    /       \\ /  |                                /  |/  \\ /  \\   \n" +
                "/$$$$$$  |  ______    ______    ______   _$$ |_     ______        $$$$$$$  |$$ |  ______   __    __             $$ |$$  \\$$  \\  \n" +
                "$$ |__$$ | /      \\  /      \\  /      \\ / $$   |   /      \\       $$ |__$$ |$$ | /      \\ /  |  /  |            $$ | $$  \\$$  \\ \n" +
                "$$    $$ |/$$$$$$  |/$$$$$$  |/$$$$$$  |$$$$$$/   /$$$$$$  |      $$    $$/ $$ | $$$$$$  |$$ |  $$ |            $$/   $$  |$$  |\n" +
                "$$$$$$$$ |$$ |  $$ |$$    $$ |$$ |  $$/   $$ | __ $$    $$ |      $$$$$$$/  $$ | /    $$ |$$ |  $$ |            /  |  /$$/ /$$/ \n" +
                "$$ |  $$ |$$ |__$$ |$$$$$$$$/ $$ |        $$ |/  |$$$$$$$$/       $$ |      $$ |/$$$$$$$ |$$ \\__$$ |            $$ | /$$/ /$$/  \n" +
                "$$ |  $$ |$$    $$/ $$       |$$ |        $$  $$/ $$       |      $$ |      $$ |$$    $$ |$$    $$ |            $$ |/$$/ /$$/   \n" +
                "$$/   $$/ $$$$$$$/   $$$$$$$/ $$/          $$$$/   $$$$$$$/       $$/       $$/  $$$$$$$/  $$$$$$$ |            $$/ $$/  $$/    \n" +
                "          $$ |                                                                            /  \\__$$ |                            \n" +
                "          $$ |                                                                            $$    $$/                             \n" +
                "          $$/                                                                              $$$$$$/                              ");
       /* System.out.println( "\n\n" +
                "                                ██████╗     ███████╗    ██╗     ██████╗     ███╗   ██╗    ███████╗                                              \n" +
                "                                ██╔══██╗    ██╔════╝    ██║    ██╔════╝     ████╗  ██║    ██╔════╝                                              \n" +
                "                                ██████╔╝    █████╗      ██║    ██║  ███╗    ██╔██╗ ██║    ███████╗                                              \n" +
                "                                ██╔══██╗    ██╔══╝      ██║    ██║   ██║    ██║╚██╗██║    ╚════██║                                              \n" +
                "                                ██║  ██║    ███████╗    ██║    ╚██████╔╝    ██║ ╚████║    ███████║                                              \n" +
                "                                ╚═╝  ╚═╝    ╚══════╝    ╚═╝     ╚═════╝     ╚═╝  ╚═══╝    ╚══════╝                                              \n" +
                "                                                                                                                                                \n" +
                "                                                 ██████╗     ███████╗                                                                           \n" +
                "                                                ██╔═══██╗    ██╔════╝                                                                           \n" +
                "                                                ██║   ██║    █████╗                                                                             \n" +
                "                                                ██║   ██║    ██╔══╝                                                                             \n" +
                "                                                ╚██████╔╝    ██║                                                                                \n" +
                "                                                 ╚═════╝     ╚═╝                                                                                \n" +
                "                                                                                                                                                \n" +
                "                                            ████████╗██╗  ██╗███████╗                                                                           \n" +
                "                                            ╚══██╔══╝██║  ██║██╔════╝                                                                           \n" +
                "                                               ██║   ███████║█████╗                                                                             \n" +
                "                                               ██║   ██╔══██║██╔══╝                                                                             \n" +
                "                                               ██║   ██║  ██║███████╗                                                                           \n" +
                "                                               ╚═╝   ╚═╝  ╚═╝╚══════╝                                                                           \n" +
                "                                                                                                                                                \n" +
                "██╗   ██╗    ██╗    ██╗  ██╗    ██╗    ███╗   ██╗     ██████╗     ███████╗        ██╗    ██╗ █████╗ ██████╗ ██████╗ ██╗ ██████╗ ██████╗ ███████╗\n" +
                "██║   ██║    ██║    ██║ ██╔╝    ██║    ████╗  ██║    ██╔════╝     ██╔════╝        ██║    ██║██╔══██╗██╔══██╗██╔══██╗██║██╔═══██╗██╔══██╗██╔════╝\n" +
                "██║   ██║    ██║    █████╔╝     ██║    ██╔██╗ ██║    ██║  ███╗    ███████╗        ██║ █╗ ██║███████║██████╔╝██████╔╝██║██║   ██║██████╔╝███████╗\n" +
                "╚██╗ ██╔╝    ██║    ██╔═██╗     ██║    ██║╚██╗██║    ██║   ██║    ╚════██║        ██║███╗██║██╔══██║██╔══██╗██╔══██╗██║██║   ██║██╔══██╗╚════██║\n" +
                " ╚████╔╝     ██║    ██║  ██╗    ██║    ██║ ╚████║    ╚██████╔╝    ███████║        ╚███╔███╔╝██║  ██║██║  ██║██║  ██║██║╚██████╔╝██║  ██║███████║\n" +
                "  ╚═══╝      ╚═╝    ╚═╝  ╚═╝    ╚═╝    ╚═╝  ╚═══╝     ╚═════╝     ╚══════╝         ╚══╝╚══╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝ ╚═╝  ╚═╝╚══════╝\n" );


        System.out.println( "" +
                "  ______                                   __                      _______   __                                  __  __   __    \n" +
                " /      \\                                 /  |                    /       \\ /  |                                /  |/  \\ /  \\   \n" +
                "/$$$$$$  |  ______    ______    ______   _$$ |_     ______        $$$$$$$  |$$ |  ______   __    __             $$ |$$  \\$$  \\  \n" +
                "$$ |__$$ | /      \\  /      \\  /      \\ / $$   |   /      \\       $$ |__$$ |$$ | /      \\ /  |  /  |            $$ | $$  \\$$  \\ \n" +
                "$$    $$ |/$$$$$$  |/$$$$$$  |/$$$$$$  |$$$$$$/   /$$$$$$  |      $$    $$/ $$ | $$$$$$  |$$ |  $$ |            $$/   $$  |$$  |\n" +
                "$$$$$$$$ |$$ |  $$ |$$    $$ |$$ |  $$/   $$ | __ $$    $$ |      $$$$$$$/  $$ | /    $$ |$$ |  $$ |            /  |  /$$/ /$$/ \n" +
                "$$ |  $$ |$$ |__$$ |$$$$$$$$/ $$ |        $$ |/  |$$$$$$$$/       $$ |      $$ |/$$$$$$$ |$$ \\__$$ |            $$ | /$$/ /$$/  \n" +
                "$$ |  $$ |$$    $$/ $$       |$$ |        $$  $$/ $$       |      $$ |      $$ |$$    $$ |$$    $$ |            $$ |/$$/ /$$/   \n" +
                "$$/   $$/ $$$$$$$/   $$$$$$$/ $$/          $$$$/   $$$$$$$/       $$/       $$/  $$$$$$$/  $$$$$$$ |            $$/ $$/  $$/    \n" +
                "          $$ |                                                                            /  \\__$$ |                            \n" +
                "          $$ |                                                                            $$    $$/                             \n" +
                "          $$/                                                                              $$$$$$/                       " );

*/
        System.out.println( "\n" +
                "" +
                "\t\tÒla Caros Amigos Pronto pra inicia \n" +
                "\t\tUma aventura da Historia muito Importante da civilização \n" +
                "\t\tOs Guerreiros Vikings\n\n\t" );
        System.out.println("\n\n"
                + "_____________________________________________________________________________________________________________________________________\n"
                + "=====================================================================================================================================\n"
                + "_____________________________________________________________________________________________________________________________________\n"
                + "");


        PlayOn.Menu();
    }
}

