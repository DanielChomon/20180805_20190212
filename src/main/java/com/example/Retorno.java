package com.example;

public class Retorno {
    public void retornar(String nombre, String apellido){
        int a = nombre.length();
        int b = apellido.length();
        String nombre_retornado = "a", apellido_retornado = "a";
        int x = 1;
        int y = 1;
        while (x <= a){
            if(x == 1){
                char primera_letra = nombre.charAt(1);
                nombre_retornado = String.valueOf(Character.toUpperCase(primera_letra));
            }
            else{
                char letra = nombre.charAt(x);
                nombre_retornado = String.format(nombre_retornado + String.valueOf(Character.toLowerCase(letra)));

            }
            x ++;
        }
        while (!(y > b)){
            if(1 == y){
                char primera_letra = apellido.charAt(1);
                apellido_retornado = String.valueOf(Character.toUpperCase(primera_letra));
            }
            else{
                char letra = apellido.charAt(x);
                apellido_retornado = String.format(apellido_retornado + String.valueOf(Character.toLowerCase(letra)));

            }
            y ++;
        }
        return nombre_retornado, apellido_retornado;

    }


}
