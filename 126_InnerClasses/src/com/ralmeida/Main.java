package com.ralmeida;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrintLocal = new Button("Print Local");
    private static Button btnPrintAnounymous = new Button("Print Anounymous");

    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);

        //reference of a inner class needs outter class to be created first and used for that
//      Gearbox.Gear first = mclaren.new Gear(1, 12.3);
//      System.out.println(first.driveSpeed(1000));

//        mclaren.addGear(1, 5.3);
//        mclaren.addGear(2, 10.6);
//        mclaren.addGear(3, 15.9);

        // Gear is an example of inner class
        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));

        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(3000));

        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(6000));


        // ClickListener is an example of local class (used only for this part of program)
        class ClickListener implements Button.OnClickListener{
            public ClickListener() {
                System.out.println("Button has been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked!");
            }
        }

        // btnPrintLocal use local class ClickLisntener
        btnPrintLocal.setOnClickListener(new ClickListener());

        // below is an example of anonymous class (which is create and used as parameter)
        btnPrintAnounymous.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked!");
            }
        });

        listen();


    }

    private static void listen() {
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrintLocal.onClick();
                    break;
                case 2:
                    btnPrintAnounymous.onClick();
                    break;
            }


        }
    }
}
