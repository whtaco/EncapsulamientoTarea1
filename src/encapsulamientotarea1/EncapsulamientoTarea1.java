/*
Diseñe e implemente un algoritmo, que permita crear una clase llamada Sensor, 
el cual tenga como atributos: tipoSensor de tipo cadena; presionSensor de tipo 
entero; numeroTiposSensor de tipo entero; además, implemente los métodos get() 
y set() para cada atributo. Imprima tanto el tipo de sensor, como el número de 
tipos de sensores que se implementan en la compresión de un motor.
 */
package encapsulamientotarea1;

/**
 *
 * @author WILLIAM HERNAN TACO TACO
 */
class Sensor{
    private String tipoSensor;
    private int presionSensor;
    private int numeroTiposSensor=0;
    
    
    
    public String gettipoSensor(){
        return tipoSensor;
    }
   
    public void settipoSensor(String tipoSensor){
        if("MAP".equals(tipoSensor)||"MAF".equals(tipoSensor)||"Sensor Voltaje".equals(tipoSensor)||"Sensor Intensidad".equals(tipoSensor)){
            this.tipoSensor=tipoSensor;
            numeroTiposSensor++;
        }else{
            System.out.println("Sensor no disponible "+ 
                    "Por tanto, camara de compresión no funciona");
        }
        
    }
    public int getnumeroTiposSensor(){
        return numeroTiposSensor;
    }
    
    public int getpresionSensor(){
        int presionTotal;
        int presion1=125;
        int presion2=120;
        presionTotal=presion1+presion2;
        return presionTotal;
    }
}
public class EncapsulamientoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE ");
        System.out.println("\t\tSEDE LATACUNGA");
        System.out.println("Estudiante: William Taco");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Asignatura: Programación [7450]");
       
        System.out.println("*****************************************");
        Sensor sensor1=new Sensor();
        sensor1.settipoSensor("MAP");
        sensor1.settipoSensor("MAF");
        sensor1.settipoSensor("Sensor Voltaje");
        sensor1.settipoSensor("Sensor Intensidad");
        System.out.println("El numero sensores activos son: "+ 
                sensor1.getnumeroTiposSensor()+" sensores");
        
        System.out.println("Lista de sensores");
        System.out.println(" MAP \n MAF \n Sensor Voltaje \n Sensor Intensidad");
        
        System.out.println("*****************************************");
        
        Sensor sensor2=new Sensor();
        sensor2.settipoSensor("MAP");
        sensor2.settipoSensor("MAF");
        System.out.println("El numero sensores activos en la camara de compresión son: "+
                sensor2.getnumeroTiposSensor()+" sensores");
        System.out.println("Lista de sensores en la camara de combustión");
        System.out.println(" MAP \n MAF");
        System.out.println("Cuya presión de funcionamiento combinada es: "+sensor2.getpresionSensor());
        System.out.println("*****************************************");
    }
    
}
