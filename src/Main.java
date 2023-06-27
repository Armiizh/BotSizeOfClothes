import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//                           Задание
// Пишем полноценного бота, который имеет какое-то количество команд
// и может выдать какую-то информацию по ним. На любой ввод, который
// не попадает под команды выдаем список команд с предложением -
// извините, но такой команды нет. Вот список того, что вы можете узнать.
// Добавить команду выхода и при ее вводе выйти из программы.
public class Main {
    public static void main(String[] args) {
        print("Добро пожаловать в бота, который с легкость определит ваш размер одежды\n\n" +
                "Выберите, чтобы вы хотели узнать:\n\n" +
                "1 - Определить международный размер по параметрам;\n" +
                "2 - Определить параметры по международному размеру\n\n" +
                "3 - Я знаю свой международный размер, какой это российский?\n" +
                "4 - Я знаю свой российский размер, какой это международный?\n\n" +
                "5 - Выход\n\n");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //Если ввод не попадает под команды, то повторяем
        while (number<1 || number>5) {
            print("Извините, но у нас нет такой команды, вот список того,\n" +
                    "что вы можете выбрать:\n\n" +
                    "1 - Определить международный размер по параметрам;\n" +
                    "2 - Определить параметры по международному размеру\n\n" +
                    "3 - Я знаю свой международный размер, какой это российский?\n" +
                    "4 - Я знаю свой российский размер, какой это международный?\n\n" +
                    "5 - Выход\n\n");
            number=scanner.nextInt();
            break;
        }
        //Выход
        if (number == 5) {
            print("До свидания!");
            System.exit(0);
        } else {
            //-------------------------------------------------------

            //Определение международного размера по параметрам

            //-------------------------------------------------------
            if (number == 1) {

                print("Выберите ваш пол:\n" +
                        "1 - Женский;\n" +
                        "2 - Мужской;\n\n" +
                        "3 - Выход.");
                int gender = scanner.nextInt();
                //Если ввод не попадает под команды, то повторяем
                while (gender<1 || gender>3) {
                    print("Извините, но у нас нет такой команды, вот список того,\n" +
                            "что вы можете выбрать:\n\n" +
                            "1 - Женский;\n" +
                            "2 - Мужской;\n\n"+
                            "3 - Выход.");
                    gender=scanner.nextInt();
                    break;
                }

                if (gender == 1) {
                    //женская одежда
                    print("Для определения женского международного размера\n" +
                            "Введите, пожалуйста, обхват вашей груди в см");
                    int breasts = scanner.nextInt();

                    print("Введите, пожалуйста, обхват вашей талии в см");
                    int waist = scanner.nextInt();

                    print("Введите, пожалуйста, обхват ваших бёдер в см");
                    int thigh = scanner.nextInt();


                    if ((breasts < 50 || breasts > 150) ||
                            (waist < 40 || waist > 150) ||
                            (thigh < 60 || thigh > 150)) {
                        print("Данные размеры нам неизвестны :(");

                    } else if ((breasts > 50 && breasts < 76) &&
                            (waist > 40 && waist < 58) &&
                            (thigh > 60 && thigh < 82)) {
                        print("Ваш международный размер - XXS");
                    } else if ((breasts > 76 && breasts < 80) &&
                            (waist > 58 && waist < 62) &&
                            (thigh > 82 && thigh < 86)) {
                        print("Ваш международный размер - XS");
                    } else if ((breasts > 80 && breasts < 84) &&
                            (waist > 62 && waist < 66) &&
                            (thigh > 86 && thigh < 92)) {
                        print("Ваш международный размер - S");
                    } else if ((breasts > 84 && breasts < 88) &&
                            (waist > 66 && waist < 70) &&
                            (thigh > 92 && thigh < 96)) {
                        print("Ваш международный размер - M");
                    } else if ((breasts > 88 && breasts < 92) &&
                            (waist > 70 && waist < 74) &&
                            (thigh > 96 && thigh < 100)) {
                        print("Ваш международный размер - M");
                    } else if ((breasts > 92 && breasts < 96) &&
                            (waist > 74 && waist < 78) &&
                            (thigh > 100 && thigh < 104)) {
                        print("Ваш международный размер - L");
                    } else if ((breasts > 96 && breasts < 100) &&
                            (waist > 78 && waist < 82) &&
                            (thigh > 104 && thigh < 108)) {
                        print("Ваш международный размер - L");
                    } else if ((breasts > 100 && breasts < 104) &&
                            (waist > 82 && waist < 86) &&
                            (thigh > 108 && thigh < 112)) {
                        print("Ваш международный размер - XL");
                    } else if ((breasts > 104 && breasts < 108) &&
                            (waist > 86 && waist < 90) &&
                            (thigh > 112 && thigh < 116)) {
                        print("Ваш международный размер - XXL");
                    } else if ((breasts > 108 && breasts < 112) &&
                            (waist > 90 && waist < 94) &&
                            (thigh > 116 && thigh < 120)) {
                        print("Ваш международный размер - XXL");
                    } else if ((breasts > 112 && breasts < 116) &&
                            (waist > 94 && waist < 98) &&
                            (thigh > 120 && thigh < 124)) {
                        print("Ваш международный размер - XXXL");
                    } else {
                        print("У вас не стандартный размер, не расстраивайтесь, вам лучше примерить одежду");
                    }


                } else if (gender == 2) {
                    //мужская одежда
                    print("Для определения мужского международного размера\n" +
                            "Введите, пожалуйста, обхват вашей груди в см");
                    int breasts = scanner.nextInt();

                    print("Введите, пожалуйста, обхват вашей талии в см");
                    int waist = scanner.nextInt();

                    print("Введите, пожалуйста, обхват ваших бёдер в см");
                    int thigh = scanner.nextInt();


                    if ((breasts < 50 || breasts > 150) ||
                            (waist < 40 || waist > 150) ||
                            (thigh < 60 || thigh > 150)) {
                        print("Данные размеры нам неизвестны :(");

                    } else if ((breasts > 50 && breasts < 88) &&
                            (waist > 40 && waist < 70) &&
                            (thigh > 60 && thigh < 92)) {
                        print("Ваш международный размер - XXS");
                    } else if ((breasts > 88 && breasts < 92) &&
                            (waist > 70 && waist < 76) &&
                            (thigh > 92 && thigh < 96)) {
                        print("Ваш международный размер - XS");
                    } else if ((breasts > 92 && breasts < 96) &&
                            (waist > 76 && waist < 82) &&
                            (thigh > 96 && thigh < 100)) {
                        print("Ваш международный размер - S");
                    } else if ((breasts > 96 && breasts < 100) &&
                            (waist > 82 && waist < 88) &&
                            (thigh > 100 && thigh < 104)) {
                        print("Ваш международный размер - M");
                    } else if ((breasts > 100 && breasts < 104) &&
                            (waist > 88 && waist < 94) &&
                            (thigh > 104 && thigh < 108)) {
                        print("Ваш международный размер - L");
                    } else if ((breasts > 104 && breasts < 108) &&
                            (waist > 94 && waist < 100) &&
                            (thigh > 108 && thigh < 112)) {
                        print("Ваш международный размер - XL");
                    } else if ((breasts > 108 && breasts < 112) &&
                            (waist > 100 && waist < 106) &&
                            (thigh > 112 && thigh < 116)) {
                        print("Ваш международный размер - XXL");
                    } else if ((breasts > 112 && breasts < 116) &&
                            (waist > 106 && waist < 112) &&
                            (thigh > 116 && thigh < 120)) {
                        print("Ваш международный размер - XXXL");
                    } else {
                        print("У вас не стандартный размер, не расстраивайтесь, вам лучше примерить одежду");
                    }
                }
            }
            //-------------------------------------------------------

            //Определение параметров по международному размеру

            //-------------------------------------------------------
            else if (number==2) {
                print("Выберите ваш пол:\n" +
                        "1 - Женский;\n" +
                        "2 - Мужской;\n\n" +
                        "3 - Выход.");
                int gender = scanner.nextInt();
                //Если ввод не попадает под команды, то повторяем
                while (gender<1 || gender>3) {
                    print("Извините, но у нас нет такой команды, вот список того,\n" +
                            "что вы можете выбрать:\n\n" +
                            "1 - Женский;\n" +
                            "2 - Мужской;\n\n"+
                            "3 - Выход.");
                    gender=scanner.nextInt();
                    break;
                }

                if (gender==3) {
                    print("Всего доброго!");
                    return;
                } else


                if (gender==2) {
                    //мужские размеры



                    print("Для определения ваших параметров выберите ваш международный размер\n\n" +
                            "1 - XXS\n" +
                            "2 - XS\n" +
                            "3 - S\n" +
                            "4 - M\n" +
                            "5 - L\n" +
                            "6 - XL\n" +
                            "7 - XXL\n" +
                            "8 - XXXL\n\n" +
                            "9 - Выход");
                    int size = scanner.nextInt();
                    while (size<1 || size>8) {
                        print("Извините, но у нас нет такой команды, вот список того,\n" +
                                "что вы можете выбрать:\n\n" +
                                "1 - XXS\n" +
                                "2 - XS\n" +
                                "3 - S\n" +
                                "4 - M\n" +
                                "5 - L\n" +
                                "6 - XL\n" +
                                "7 - XXL\n" +
                                "8 - XXXL\n\n" +
                                "9 - Выход");
                        size=scanner.nextInt();
                        break;
                    }
                    if (size==9) {
                        print("Всего доброго!");
                        return;
                    }
                    if (size==1) {
                        //XXS
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 88 до 92 см\n" +
                                "Обхват талии - от 70 до 76 см\n" +
                                "Обхват бёдер - от 92 до 96 см\n");
                    } else if (size==2) {
                        //XS
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 92 до 96 см\n" +
                                "Обхват талии - от 76 до 82 см\n" +
                                "Обхват бёдер - от 96 до 100 см\n");
                    } else if (size==3) {
                        //S
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 96 до 100 см\n" +
                                "Обхват талии - от 82 до 88 см\n" +
                                "Обхват бёдер - от 100 до 104 см\n");
                    } else if (size==4) {
                        //M
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 100 до 104 см\n" +
                                "Обхват талии - от 88 до 94 см\n" +
                                "Обхват бёдер - от 104 до 108 см\n");
                    } else if (size==5) {
                        //L
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 104 до 108 см\n" +
                                "Обхват талии - от 94 до 100 см\n" +
                                "Обхват бёдер - от 108 до 112 см\n");
                    } else if (size==6) {
                        //XL
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 108 до 112 см\n" +
                                "Обхват талии - от 100 до 106 см\n" +
                                "Обхват бёдер - от 112 до 116 см\n");
                    } else if (size==7) {
                        //XXL
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 112 до 116 см\n" +
                                "Обхват талии - от 106 до 112 см\n" +
                                "Обхват бёдер - от 116 до 120 см\n");
                    } else if (size==8) {
                        //XXXL
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 116 до 128 см\n" +
                                "Обхват талии - от 112 до 124 см\n" +
                                "Обхват бёдер - от 120 до 132 см\n");
                    }
                }

                if (gender==1) {
                    //Женские размеры
                    print("Для определения ваших параметров выберите ваш международный размер\n\n" +
                            "1 - XXS\n" +
                            "2 - XS\n" +
                            "3 - S\n" +
                            "4 - M\n" +
                            "5 - L\n" +
                            "6 - XL\n" +
                            "7 - XXL\n" +
                            "8 - XXXL\n\n" +
                            "9 - Выход");
                    int size = scanner.nextInt();
                    while (size<1 || size>8) {
                        print("Извините, но у нас нет такой команды, вот список того,\n" +
                                "что вы можете выбрать:\n\n" +
                                "1 - XXS\n" +
                                "2 - XS\n" +
                                "3 - S\n" +
                                "4 - M\n" +
                                "5 - L\n" +
                                "6 - XL\n" +
                                "7 - XXL\n" +
                                "8 - XXXL\n\n" +
                                "9 - Выход");
                        size=scanner.nextInt();
                        break;
                    }
                    if (size==9) {
                        print("Всего доброго!");
                        return;
                    }
                    if (size==1) {
                        //XXS
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 76 до 80 см\n" +
                                "Обхват талии - от 58 до 62 см\n" +
                                "Обхват бёдер - от 82 до 86 см\n");
                    } else if (size==2) {
                        //XS
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 80 до 84 см\n" +
                                "Обхват талии - от 62 до 66 см\n" +
                                "Обхват бёдер - от 86 до 92 см\n");
                    } else if (size==3) {
                        //S
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 84 до 88 см\n" +
                                "Обхват талии - от 66 до 70 см\n" +
                                "Обхват бёдер - от 92 до 96 см\n");
                    } else if (size==4) {
                        //M
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 88 до 96 см\n" +
                                "Обхват талии - от 70 до 78 см\n" +
                                "Обхват бёдер - от 96 до 104 см\n");
                    } else if (size==5) {
                        //L
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 96 до 104 см\n" +
                                "Обхват талии - от 78 до 86 см\n" +
                                "Обхват бёдер - от 104 до 112 см\n");
                    } else if (size==6) {
                        //XL
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 104 до 108 см\n" +
                                "Обхват талии - от 86 до 90 см\n" +
                                "Обхват бёдер - от 112 до 116 см\n");
                    } else if (size==7) {
                        //XXL
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 108 до 116 см\n" +
                                "Обхват талии - от 90 до 98 см\n" +
                                "Обхват бёдер - от 116 до 124 см\n");
                    } else if (size==8) {
                        //XXXL
                        print("Ваши размеры:\n\n" +
                                "Обхват груди - от 116 до 120 см\n" +
                                "Обхват талии - от 98 до 100 см\n" +
                                "Обхват бёдер - от 124 до 128 см\n");
                    }
                }
            }
            //-------------------------------------------------------

            //Определение российского размера по международному

            //-------------------------------------------------------
            else if (number==3) {
                print("Выберите ваш пол:\n" +
                        "1 - Женский;\n" +
                        "2 - Мужской;\n\n" +
                        "3 - Выход.");
                int gender = scanner.nextInt();
                //Если ввод не попадает под команды, то повторяем
                while (gender<1 || gender>3) {
                    print("Извините, но у нас нет такой команды, вот список того,\n" +
                            "что вы можете выбрать:\n\n" +
                            "1 - Женский;\n" +
                            "2 - Мужской;\n\n"+
                            "3 - Выход.");
                    gender=scanner.nextInt();
                    break;
                } if (gender==3) {
                    print("Всего доброго!");
                    System.exit(0);
                } else
                    //Женские размеры
                    if (gender==1) {
                        print("Для определения вашего российского размера выберите" +
                                "ваш международный:\n\n" +
                                "1 - XXS\n" +
                                "2 - XS\n" +
                                "3 - S\n" +
                                "4 - M\n" +
                                "5 - L\n" +
                                "6 - XL\n" +
                                "7 - XXL\n" +
                                "8 - XXXL\n\n" +
                                "9 - Выход");
                        int size = scanner.nextInt();
                        while (size<1 || size>9) {
                            print("Извините, но у нас нет такой команды, вот список того,\n" +
                                    "что вы можете выбрать:\n\n" +
                                    "1 - XXS\n" +
                                    "2 - XS\n" +
                                    "3 - S\n" +
                                    "4 - M\n" +
                                    "5 - L\n" +
                                    "6 - XL\n" +
                                    "7 - XXL\n" +
                                    "8 - XXXL\n\n" +
                                    "9 - Выход");
                            size=scanner.nextInt();
                            break;
                        } if (size==9) {
                            print("Всего доброго!");
                            System.exit(0);
                        } else if (size==1) {
                            //XXS
                            print("Ваш российский размер - 38");
                        } else if (size==2) {
                            //XS
                            print("Ваш российский размер - 40");
                        } else if (size==3) {
                            //S
                            print("Ваш российский размер - 42");
                        } else if (size==4) {
                            //M
                            print("Ваш российский размер - 44-46");
                        } else if (size==5) {
                            //L
                            print("Ваш российский размер - 48-50");
                        } else if (size==6) {
                            //XL
                            print("Ваш российский размер - 52");
                        } else if (size==7) {
                            //XXL
                            print("Ваш российский размер - 54-56");
                        } else if (size==8) {
                            //XXXL
                            print("Ваш российский размер - 58");
                        }
                    }
                    //Мужские размеры
                    else if (gender==2) {
                        print("Для определения вашего российского размера выберите" +
                                "ваш международный:\n\n" +
                                "1 - XXS\n" +
                                "2 - XS\n" +
                                "3 - S\n" +
                                "4 - M\n" +
                                "5 - L\n" +
                                "6 - XL\n" +
                                "7 - XXL\n" +
                                "8 - XXXL\n\n" +
                                "9 - Выход");
                        int size = scanner.nextInt();
                        while (size<1 || size>9) {
                            print("Извините, но у нас нет такой команды, вот список того,\n" +
                                    "что вы можете выбрать:\n\n" +
                                    "1 - XXS\n" +
                                    "2 - XS\n" +
                                    "3 - S\n" +
                                    "4 - M\n" +
                                    "5 - L\n" +
                                    "6 - XL\n" +
                                    "7 - XXL\n" +
                                    "8 - XXXL\n\n" +
                                    "9 - Выход");
                            size = scanner.nextInt();
                            break;
                        } if (size==9) {
                            print("Всего доброго!");
                            System.exit(0);
                        } else if (size==1) {
                            //XXS
                            print("Ваш российский размер - 44");
                        } else if (size==2) {
                            //XS
                            print("Ваш российский размер - 46");
                        } else if (size==3) {
                            //S
                            print("Ваш российский размер - 48");
                        } else if (size==4) {
                            //M
                            print("Ваш российский размер - 50");
                        } else if (size==5) {
                            //L
                            print("Ваш российский размер - 52");
                        } else if (size==6) {
                            //XL
                            print("Ваш российский размер - 54");
                        } else if (size==7) {
                            //XXL
                            print("Ваш российский размер - 56");
                        } else if (size==8) {
                            //XXXL
                            print("Ваш российский размер - 58-62");
                        }
                    }
            }
            //-------------------------------------------------------

            //Определение международного размера по российскому

            //-------------------------------------------------------
            else if (number==4) {
                print("Выберите ваш пол:\n" +
                        "1 - Женский;\n" +
                        "2 - Мужской;\n\n" +
                        "3 - Выход.");
                int gender = scanner.nextInt();
                //Если ввод не попадает под команды, то повторяем
                while (gender < 1 || gender > 3) {
                    print("Извините, но у нас нет такой команды, вот список того,\n" +
                            "что вы можете выбрать:\n\n" +
                            "1 - Женский;\n" +
                            "2 - Мужской;\n\n" +
                            "3 - Выход.");
                    gender = scanner.nextInt();
                    break;
                }
                if (gender == 3) {
                    print("Всего доброго!");
                    System.exit(0);
                } else
                    //Женские размеры
                    if (gender == 1) {
                        print("Для определения вашего международного размера выберите" +
                                "ваш российский:\n\n" +
                                "1 - 38\n" +
                                "2 - 40\n" +
                                "3 - 42\n" +
                                "4 - 44-46\n" +
                                "5 - 48-50\n" +
                                "6 - 52\n" +
                                "7 - 54-56\n" +
                                "8 - 58\n\n" +
                                "9 - Выход");
                        int size = scanner.nextInt();
                        while (size < 1 || size > 9) {
                            print("Извините, но у нас нет такой команды, вот список того,\n" +
                                    "что вы можете выбрать:\n\n" +
                                    "1 - 38\n" +
                                    "2 - 40\n" +
                                    "3 - 42\n" +
                                    "4 - 44-46\n" +
                                    "5 - 48-50\n" +
                                    "6 - 52\n" +
                                    "7 - 54-56\n" +
                                    "8 - 58\n\n" +
                                    "9 - Выход");
                            size = scanner.nextInt();
                            break;
                        }
                        if (size == 9) {
                            print("Всего доброго!");
                            System.exit(0);
                        } else if (size == 1) {
                            //38
                            print("Ваш международный размер - XXS");
                        } else if (size == 2) {
                            //40
                            print("Ваш международный размер - XS");
                        } else if (size == 3) {
                            //42
                            print("Ваш международный размер - S");
                        } else if (size == 4) {
                            //44-46
                            print("Ваш международный размер - M");
                        } else if (size == 5) {
                            //48-50
                            print("Ваш международный размер - L");
                        } else if (size == 6) {
                            //52
                            print("Ваш международный размер - XL");
                        } else if (size == 7) {
                            //54-56
                            print("Ваш международный размер - XXL");
                        } else if (size == 8) {
                            //58
                            print("Ваш международный размер - XXXL");
                        }
                    }
                    //Мужские размеры
                    else if (gender == 2) {
                        print("Для определения вашего международного размера выберите" +
                                "ваш российский:\n\n" +
                                "1 - 44\n" +
                                "2 - 46\n" +
                                "3 - 48\n" +
                                "4 - 50\n" +
                                "5 - 52\n" +
                                "6 - 54\n" +
                                "7 - 56\n" +
                                "8 - 58-62\n\n" +
                                "9 - Выход");
                        int size = scanner.nextInt();
                        while (size < 1 || size > 9) {
                            print("Извините, но у нас нет такой команды, вот список того,\n" +
                                    "что вы можете выбрать:\n\n" +
                                    "1 - 44\n" +
                                    "2 - 46\n" +
                                    "3 - 48\n" +
                                    "4 - 50\n" +
                                    "5 - 52\n" +
                                    "6 - 54\n" +
                                    "7 - 56\n" +
                                    "8 - 58-62\n\n" +
                                    "9 - Выход");
                            size = scanner.nextInt();
                            break;
                        }
                        if (size == 9) {
                            print("Всего доброго!");
                            System.exit(0);
                        } else if (size == 1) {
                            //44
                            print("Ваш международный размер - XXS");
                        } else if (size == 2) {
                            //46
                            print("Ваш международный размер - XS");
                        } else if (size == 3) {
                            //48
                            print("Ваш международный размер - S");
                        } else if (size == 4) {
                            //50
                            print("Ваш международный размер - M");
                        } else if (size == 5) {
                            //52
                            print("Ваш международный размер - L");
                        } else if (size == 6) {
                            //54
                            print("Ваш международный размер - XL");
                        } else if (size == 7) {
                            //56
                            print("Ваш международный размер - XXL");
                        } else if (size == 8) {
                            //58-62
                            print("Ваш международный размер - XXXL");
                        }
                    }
            }//Конец number4

        }
    }


    public static void print(String result) {
        System.out.println(result);
    }
}
