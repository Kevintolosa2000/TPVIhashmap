package Punto1;

import java.util.Random;

public class Persona {
    //nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura
    private String nombre = "";
    private Integer edad = 0;
    private String DNI;
    private String sexo = "";
    private Double peso = (double) 0;
    private Double altura = (double) 0;

    public Persona() {

    }

    public Persona(String nombre, Integer edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        comprobarSexo(sexo);
        //this.peso = peso;
        //this.altura = altura;
    }

    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public Integer calcularIMC() {

        Double i = this.peso / (Math.pow(this.altura, 2));
        if (i < 20) {
            return -1;
        } else if (20 <= i && i <= 25)
            return 0;
        else {
            return 1;
        }
    }

    public Boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    public void comprobarSexo(String sexo) {
        if (sexo.equalsIgnoreCase("m")) {
            this.sexo = sexo;
        } else {
            this.sexo = "h";
        }
    }

    private String generaDNI() {
        Random nacho = new Random();
        Integer i = nacho.nextInt(100000) + 4000000;
        String dni = "" + i;
        return dni;
    }

}
