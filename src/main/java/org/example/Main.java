package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {


        //datos del jugador

        String contrasena;
        String contrasenaBD="tomas0304";
        String nickname;
        String nicknameBD="terreneitor";
        Integer vidaBase=70;
        Integer skillsVida=0;
        Integer contaodrDeDisparos=0;
        Integer precioSkillVida=100000;
        Integer daniDisparo=-5;
        boolean estaMuerto=false;

        String juego1="freefire";
        String juego2="fifa 24";
        String juegoseleccionado;

        Scanner lea=new Scanner(System.in);

        //proceso
        System.out.println("******ingresando******");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("bienvenido a freefire");
        System.out.println("-----------------------");
        System.out.println("porfavor ingrese su nikname");
        nickname=lea.nextLine();
        System.out.println("dijite su contraseña: ");
        contrasena=lea.nextLine();

        //rutina para verificar perfil.
        if (nickname.equals(nicknameBD)&& contrasena.equals(contrasenaBD)){
            System.out.println("Bienvenido a PsPlus");
            //rutina para iniciar el juego
            System.out.println("seleccione un juego");
            juegoseleccionado=lea.nextLine();
            if (juegoseleccionado.equals(juego1)){
                //ingresa a freefire

                do {
                    //random (disparar o no)
                    Random random=new Random();
                    int disparo=random.nextInt(2);
                    if (disparo==1){
                        //le dieron
                        contaodrDeDisparos=contaodrDeDisparos+1;
                        vidaBase=vidaBase+5;
                        System.out.println("tu nivel de vida ahora es: "+vidaBase);
                        if (vidaBase==0);{
                            estaMuerto = true;
                            break;
                        }
                    }else {
                        //no le dieron
                        System.out.println("squivo la bala....");
                        contaodrDeDisparos=0;
                    }
                }while (estaMuerto==false);
                System.out.println("esta mueto!!!!!");

            }else
                System.out.println("servidores no disponibles");

        }else {
            System.out.println("Usuario no encontrado");
        }




    }
}