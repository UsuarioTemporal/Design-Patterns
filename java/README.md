
# **Patrones de diseño creacionales**

[Referenicias](https://www.tutorialspoint.com/design_pattern)

Se centran en automatizar los problemas al crear instancias de las clases de nuestra aplicacion.

## **Singleton**

Su proposito es asegurar que solo exista un instancia de una clase.Este es patron de diseño mas simple que se puede utilizar al momento del desarrollo de software.
Hay veces en las que necitaremos de una sola instacia de una conexion a una base de datos , ahora imagines que multiples usarios se conecten entonces tendremos multiples conexiones , para facilitar este es mejor crear una sola instacia de esta conexion y que los usarios consuman de esta sola instacia.

### **Implementación :**

Se debe crear una clase SingleObject . Donde su constructor sea privado para que no pueda ser instaciada y debe tener una instacia estatica de si misma .

```java
    public class Singleton{
        private static Singleton obj ;

        private Singleton(){

        }

        public static Singleton getInstance(){
            if(obj==null){
                obj = new Singleton();
            }
            return obj;
        }
    }
```

### PLUS(Control de doble bloqueo)

> Este es un patron de diseño utilizado para reducir la sobrecarga de adquirir un bloqueo al probar el criterio del bloqueo. <br>
>El bloqueo se produce solo si la verificación del criterio de bloqueo indica que se requiere un bloqueo

Forma eficiente usando el doble control de bloqueo :

```java
    public class Singleton{
        private volatile static Singleton obj ;//La palabra volatile garantizará varios subprocesos manejen la isntacia de singleton correctamente
        private Singleton(){

        }
        public static Singleton getInstance(){
            if(obj==null){
                synchronized (Singleton.class){
                    if(obj==null){
                        obj=new Singleton();
                    }
                }
            }
            return obj;
        }
    }
```

## **Factory**

Este es el patron mas usando al desarrollar software en java . Este tipo de patron de diseño se incluye en el patron de creación, ya que este patron proporciona una de las mejores formas de crear un objeto.
En este patron se crea un objeto sin exponer la logica de creacion al cliente y nos referimos al nuevo objeto creado usando lainterfaz comun.
Este objeto lo que permitirá es construir un objeto cada ves que necesitemos.por eso el nombre de fabrica

### **Intención**

Define una interfaz para crear un objeto,pero deja que las subclases decidan que clase crear una instacia.

```java
    interface IAuto{
        void arrancar();
    }

    class Toyota implements IAuto{
        @Override
        public void arrancar(){
            System.out.println("Arrancando Toyota");
        }
    }
    class Nisan implements IAuto{
        @Override
        public void arrancar(){
            System.out.println("Arrancando Nisan");
        }
    }
    class Fabrica{
        public IAuto getAuto(String marca){
            if(marca.equalsIgnoreCase("TOYOTA")){
                return new Toyota();
            }else{
                return new Nisan();
            }
        }
    }

    class Main{
        public static void main(String[] args){
            Fabrica fabrica=new Fabrica();
            IAuto toy = fabrica.getAuto("toyota");
            toy.arrancar();
            IAuto nis = fabrica.getAuto("nisan");
            nis.arrancar();
        }
    }
```

## **Prototype**

Este patron lo que permite es ocultar la complejidad de crear nuevas instancias del cliente.El concepto es copiar un objeto existente en lugar de crear una nueva instacias desde cero .El objeto existente actuara como un prototipo y contiene el estado del objeto. El objeto recien copiado podra cambiar o modificar las propiedades si es necesario.Este patron o enfoque reducirá recuersos y tiempo en lugar de crear desde cero un objeto.

> El ejemplo se puede ver en su respectiva carpeta

## **Builder**

Objetivo : Permitir que el código controle el proceso de construcion de los objetos
Separar la construccion de un objeto complejo de su reprensentacion , de manera que el mismo proceso de construccion pueda crear diferentes representaciones.

La recomendacion es que se utilice este patron de diseño cuando se desea que el código del cliente tenga un control sobre el proceso de construccion,pero que sea capaz de terminar con diferentes tipos de objetos

Este patron permite tener una politica genral para la creacion e objetos , cenmtralizandolo en una clse constructora

# **Patrones de diseño estructurales**

Estos patrones diseño estructurales nos ayudaran en tener una forma mas sencilla y concisa las relaciones entre los objetos o entidades

## **Facade**

El patrón de diseño Facade o en su traduccion como fachada oculta las complejidades del sistema y proporciona una interfaz para el cliente mediante la cual el cliente puede acceder al sistema.

Este patrón implica una clase única que proporciona métodos simplificados requeridos por el cliente y delega las llamadas a los métodos de las clases del sistema existentes.

En conclusiones este patron simplifica la complejidad del sistema.

```java
    public class Cpu{
        private int contadores = -1;
        private int memoriaRam = 0;
        private int[] canales = new int[4];
        private boolean voltajeOk, energiaDispositivosOk, 
                        contadoresOk, biosOk, hardwareOk, 
                        entradasOk, sectorArranqueOk, 
                        bootOk, soOk, listoOk;
        public Cpu(){}

        public boolean enviarVoltaje(int voltaje){
            if(voltaje>=100 && voltaje<=120){
                voltajeOk = true;
            }
            return voltajeOk;
        }

        public boolean enviaEnergiaADispositivos(){
            if(voltajeOk){
                energiaDispositivosOk = true;
            }
            return energiaDispositivosOk;
        }

        public boolean reseteaContadores(){
            if(energiaDispositivosOk){
                contadores = 0;
                contadoresOk = true;
            }
            return contadoresOk;
        }

        public boolean revisaBIOS(){
            if(voltajeOk && energiaDispositivosOk && contadoresOk){
                biosOk = true;
            }
            return biosOk;
        }

        public boolean revisaHardware(){
            if(biosOk){
                hardwareOk = true;
            }
            return hardwareOk;
        }

        public void asignaCanales(){
            if(hardwareOk){
                for(int i=0; i<canales.length; i++){
                    canales[i] = (i*4);
                }
            }
        }

        public void revisaMemoria(){
            if(canales[1]==4){
                memoriaRam = 2048;
            }
        }

        public boolean revisaEntradas(){
            if(memoriaRam>0){
                entradasOk = true;
            }
            return entradasOk;
        }

        public boolean buscaSectorArranque(){
            if(entradasOk){
                sectorArranqueOk = true;
            }
            return sectorArranqueOk;
        }

        public boolean cargaBoot(){
            if(sectorArranqueOk){
                bootOk = true;
            }
            return bootOk;
        }

        public boolean cargaSistemaOperativo(){
            if(bootOk){
                soOk = true;
            }
            return soOk;
        }

        public boolean cpuLista(){
            if(soOk){
                listoOk = true;
            }
            return listoOk;
        }
    }

    // Clase sin fachada
    class Usuario{
        private Cpu miCPU ;
        public Usuario{
            miCPU=new Cpu();
        }
        public void encenderCPU(){
            miCPU.enviarVoltaje(110);
            miCPU.enviaEnergiaADispositivos();
            miCPU.reseteaContadores();
            miCPU.revisaBIOS();
            miCPU.revisaHardware();
            miCPU.asignaCanales();
            miCPU.revisaMemoria();
            miCPU.revisaEntradas();
            miCPU.buscaSectorArranque();
            miCPU.cargaBoot();
            miCPU.cargaSistemaOperativo();
            if(miCPU.cpuLista()){
                System.out.println("\n");
                System.out.println("CPU ENCENDIDA Y LISTA PARA TRABAJAR!!!");
            }
        }
        public static void main(String[] args) {
            Usuario user = new Usuario();
            user.encenderCPU();
        }
    }

    // Con fachadda
    class Fachada(){
        private Cpu miCPU ;
        public Usuario{
            miCPU=new Cpu();
        }
        public void encenderCPU(){
            miCPU.enviarVoltaje(110);
            miCPU.enviaEnergiaADispositivos();
            miCPU.reseteaContadores();
            miCPU.revisaBIOS();
            miCPU.revisaHardware();
            miCPU.asignaCanales();
            miCPU.revisaMemoria();
            miCPU.revisaEntradas();
            miCPU.buscaSectorArranque();
            miCPU.cargaBoot();
            miCPU.cargaSistemaOperativo();
            if(miCPU.cpuLista()){
                System.out.println("\n");
                System.out.println("CPU ENCENDIDA Y LISTA PARA TRABAJAR!!!");
            }
        }
    }
    class ClienteConFachada(){
        private Fachada miFachada;

        public ClienteConFachada(){
            miFachada = new Fachada();
        }

        public void encenderCPU(){
            miFachada.encenderCPU();
            System.out.println("COMIENZO A TRABAJAR");
        }

        public static void main(String args[]){
            ClienteConFachada ccf = new ClienteConFachada();
            ccf.encenderCPU();
        }
    }
```