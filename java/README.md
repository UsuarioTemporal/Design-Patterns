
# **Patrones de diseño creacionales**

[Referencias](https://www.tutorialspoint.com/design_pattern)

[Preguntas](https://stackoverflow.com/questions/3489131/difference-between-the-facade-proxy-adapter-and-decorator-design-patterns)

[MAS INFO](https://github.com/hazardco/Patrones-de-dise-o-para-humanos)

[Mas info](http://sce2.umkc.edu/BIT/burrise/pl/design-patterns/)

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

> Este es un patron de diseño utilizado para reducir la sobrecarga de adquirir un bloqueo al probar el criterio del bloqueo.
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

### **Intencion :**

Proporcionar una interfaz simplificada para cada grupo de subsistemas o un sistema complejo

### **Motivacion**

Simplificar el acceso a un conjunto de clases , proporcionar una clase en el que todos utilizan para comunicarse

### **Objetivo :**

Reducir la complejidad y minimizar las dependencias, realizar acciones cortas

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
        public Fachada(){
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

**Conclusiones finales :**

El patron de diseño fachada discute la encapsulacion de un subsistema complejo dentro de un único objeto de interfaz.Esto reduce la curva de aprendizaje necesaria para aprovechar con exito el subsistema.Tambien promueve el desacoplamiento del subsistewma de sus potenciales clientes

## **Decorador**

Lo que hace este patron es adicionar propiedades o acciones aun cierto objeto clase o funcion sin alterar este mismo , esd ecir sin alterar las propiedades bases que tiene el objeto o clase base. Al igual que python :3

El proposito es minimizar el arbol de herencia . Asigna responsabilidades de forma dinamica a objetos , proporcionando una alternativa flexible de herencia.

Supongamos que está trabajando en un kit de herramientasde interfaz de usuario y desea admitir la adcion de border y barras de desplazamientos a als ventanas.Podria definir una jerarquia de herencia como :

![alt](https://sourcemaking.com/files/v2/content/patterns/Decorator.png)

Pero el patron decorador sugiere darle al cliente la capacidad de especificar cuelquier combinacion de **"caracteristicas"** que desee .

## **Proxy**

Da soporte a objetos que controlan la creacion y el acceso a otros objetos.Es un punto intermedio entre el cliente y esos objetos que son activados cuando se cumplen con determinados requisitos.

> Un ejemplo de Proxy puede ser el mecanismo para registrarse y hacer un login a un sitio web .No se tiene acceso a determinados objetos hasta que el usuario no este registrado y lleve a cabo el login de forma correcta.
> Otro uso de proxy es representar a un objeto que toma tiempo o recursos en crearse, de esta forma el cliente piensa que esta comunicando con el objeto , mientras el proxy decide la creacion cuando sea realmente necesario.Es decir diferenciamos la2 instaciacion del momento real de su uso.

Si un calculo lleva mucho tiempo en realizarse , podemos2 usar el proxyn para mostrar resultados intermedios

Estructuralmente es igual al patron de diseño facade.

Por lo general la intencion y el objeto de proxy es proporcionar una funcionalidad especifica que el usuario no deberia preocuparse o necesita conocer los detalles.En cambio el patron facade el usuario no tiene la la forma especifica en que se maneja , ejm una api.

Ejmplo mas comun es usar fachada en negocios,podria tener una interfaz de fachada para que el comprador ofrezca un articulo, y en el backend podria estar habalndo multiples módilos diferentes para procesar la oferta.

**Tipo de proxy :**

- Virtual : Da la creacion de un objeto a otro
- Autentificación : Verifica que los permisos de acceso sean adecuados
- Remoto : Codifica las peticiones y las envia a la red
- Smart : Adiciona o modifica las peticones antes de enviarlas

## **Patrones de diseño de comportamiento**

En el desarrollo de software , los patrones de comportamiento son patrones de diseño que identifican patrones de comunicacion comunes entre objetos. Al hacerlo estos patrones aumentan la flexibilidad para llevar a cabo esta comunicacion de manera eficiente.

> Forma en que las clases u objetos interaccionan y distribuyen funcionalidades

### **Command**

Encapsula comandos(llamados métodos) en objetos,permitiendonos realizar peticiones sin conocer exactamente la peticion que se realiza o el objeto al cual se le hace la peticion.

Encapsula una solicitud como un objeto, lo que permite parametrizar a los clientes con diferentes solicitudes.

Debe emitir solicitudes a objetos sin saber nada sobre la operacion solicitada o el receptor de la solicitud.
Tambien es conocido como Action, transaction.

A veces es necesario realizar peticiones a objetos sin conocer la peticon ni quien va dirigida.

#### **Aplicacion :**

Cuando queremos realizar peticiones en diferentes tiempos .Se puede hacer atraves de la especificacion de una cola.

Para implementar la funcion de deshacer , ya que puede alamacenar el estado de la ejecución del comando para revertir sus efectos.

Cuando necesitamos mantener un registro (log) de los cambios y acciones.

#### **Usos típicos**

Mantener un historial de peticiones(request)
Implementar la funcionalidad de callbacks

## **Memento**

Guardado del estado de alguna operacion, seria como un checkpoint para regresar a ese punto cuando lo necesitemos.

Alamacenar el estado de un objeto
Poder restaurar
Almacenamiento del estado
Hacer-Deshacer

Caretaker -- Mantener asalvo , el objeto sabe por que y cuando el creador necesita guardarse y restaurarse
Memento -- Alamacenará todo o parte del estado
Originator -- sera como el elemento , objeto que puede salvarse

Se utiliza para alamacenar y restaurar el estado de un objeto a un estado anterior

## **Observer**

Este patron de diseño es el que usa Angular

### **Proposito**

Defina una dependencia de uno a muchos entre los objetos de manera que cuando un objeto cambia de estado, todos los que dependan de el son notificados y se actualizan automaticamente.

Encapsula los componentes centrales (o comunes o del motor) en una abstarccion del sujeto, y los componentes variables (o opcionales o de interfaz de usuario) en una jerarquia de observadores.

Muchas veces se separa los datos en si de su reprenstacion (MVC) pudiendo tener varias representaciones de un mismo dato.El modelo estara separado de los datos.

> **Evitar el bucle de dependencias**

Define un objeto que sea el "keeper(guardian)" del modelo de datos y/o la lógica de negocio(el sujeto).Delegar toda la funcionalidad de "vista" a objetos Observer desacoplados y distintos.

### **Aplicacion:**

Se usa cuando un cambio en un objeto require cambiar los demas pero no sabemos cantos objetos hay que cambiar.Configurar de manera dinamica un componente de la vista, en lugar de estaticamente durante el tiempo de compilacion.Un objeto debe ser capaz de notificar sin que estos objetos esten fuertemente acoplados.

Subject : el objeto en observacion , este sujeto transmite eventos a todos los observables
El observador
Cliente

> Este patron se utiliza mucho en la programcion reactiva

```java
    // Acelerador --> Motor
    // Motor Observa (Observer) -- Acelerador Observador y el sujeto que sera el observable

    //Motor -- observador
    //acelerador sra el sujeto y esto es un observable

    interface Observer{
        void update();
    }
    class Observable{
        private List<Observer> observers=new LinkedList<>();
        public addObserver(Observer ob){
            observers.add(ob);
        }
        public void notifyObservers(){
            observers.forEach(o->o.update());
        }
    }

    class Acelerador extends Observable{ //Sujeto
        public void pisarPotencia(){
            notifyObservers();
        }
    }

    class Motor implements Observer{
        public Motor(Acelerador ace) {
            ace.addObserver(this);
        }
        @Override
        public void update(){
            System.out.println("Se piso el acelerador ");
        }
    }

    class Main{
        public static void main(String[] args) {
            Acelerador acelerador=new Acelerador(); // sujeto es decir el observable
            new Motor(acelerador); // Observer
            acelerador.pisarPotencia();
        }
    }
```

## **Strategy**

Define una familia de algoritmos , encapsularlos y hacerlos intercambiables.
Captura la abstraccfion de una interfaz, entirra los detalles de implementacion en clases derivadas.

Los algoritmos sean independientes de los usuarios que lo usan.

### **Aplicacion**

- definir una familia de comportamiento
- definir variantes de un mismo algoritmo
- poder cambiar el comportamiento en tiempo de ejecucion
- evitar condicionales
- ocultar codigo compliado, o que no queremos revelar, del usuario

### **Pasos**

Se define una familia de algoritmos intercambiables
Detalles de la implementacion del algoritmo bury en clases derivadas

**Control/Optimizacion de inventario :**

- Agregar mas algoritmos
- Generar diferentes versiones del sistema

En el patron estategia creamos objetos que representan diversas estrategias y un objeto de contexto cuyo comportamiento varia segun su objeto de estrategia.El objeto de estrategia cambia el algoritmo de ejecucion del objeto de contexto.

### **Elementos**

- Contexto : Es el elemento que usa los algoritmos , por tanto , delega en la jerarquia de estrategia concreta mediante una referencia a la estrategia.
- Strategy : Declara una interfaz comun para todos los algoritmos soportados .Estaa interfaz será usada por el contexto para invocar ala estrategia concreta
- ConcrectStrategy : implementa el algoritmo utilizando la interfaz definida por la estrategia

Imaginemos un sistema de escritura en XML o en JSON donde se almacenará los datos del usuario pero el usuario debe decidir como almacenara sus datos , entonces programamos lo siguiente un Contexto que seria el administrador que tendra la interface algoritmo o estrategia que usara el usuario para poder alamcenar correctamente sus datos

# **Extras**

## **Principio de Inyeccion de dependencias**

Tambien conocido como el patron del contenedor.
Esencialmnete , con la inyeccion de dependencias trataremos de crear metodos que nos devuelvan el objeto que les solicitemos. Esto es util porque requieren muchos parámetros o incluso otros objetos para ser iniciados .Como esto puede ser complejo, lo idela es crear un metodo que reuna toda la informacion para crear el objeto y directamente nos devulva una instacia del objeto deseado.

Este es un patron de diseño orientado a objetos, en el que se suministran objetos a una clase en lugar de ser la propia clase la responsable de instaciar . Esos objetos cumplen contratos que necesitan nuestras clases para poder funcionar(de ahi el nombre de dependencia).

```java
    // Uso del patron inyeccion de dependencias
    public class A{
        private B dependency;

        //Mediante constructor
        public A(B dependency){
            this.dependency=dependency;
        }

        // O mediante un método
        public void setDependecy(B dependecy){
            this.dependency=dependecy;
        }
}

```

## **Principio de inversion de dependencias**

> Los objetos deben ser loose coupling : Los objetos deben saber poco o nada de los otros objetos

# **Principios SOLID**

# **Patrones de arquitectura**

## **MVC**

- Model : El modelo representa un objeto o Java Pojo trasnportando datos.Tambien puede tener lógica para actualizar el controlador si sus datos cambian.Este debe ser el cerebro de la aplicacion,el modelo debe saber absolutamente nada de la interfaz grafica, y su única preocupacion debe ser la de llevar a cabo todo lo que nuestra aplicación debe hacer en lo que concierne al problema que estamos buscando resolver con la app.
- View : La vista representa la visualizacion de los datos que contienen el modelo.Esta vista sabe como acceder a a los datos del modelo, pero no sabe qué significa esta informacion o qué puede el usuario para manipularla.
- Controller : El controlador actua tanto en el modelo como la vista y actualiza la vista cuando los datos cambian.Mantiene la vista y el modelo separados.Este controlador existe entre la vista y el modelo.Escucha los eventos desencadenados por la vista(u otra fuente externa) y ejecuta la reaccion apropiada a estos eventos es llamar a un método en el modelo.Dado que la vista y el modelo están conectados a atraves de un mecanismo de notificacion , el resultado de esta acccion se refleja automaticamente en la vista.

MVC es más que un patrón de arquitectura, pero no para una aplicación completa.MVC se relacion con la capa de interaccion de una aplicacion(UI User interface) . Todavía va a necesitar una capa lógica empresarial, tal ves alguna capa de servicio y de capa de acceso a datos.

> Vista : Oye controlador, el usuario quiere que borremos el registro 4 de la tabla de alumnos .Toma la informacion

> Controlador : Muy bien vista,déjame ver si el usuario puede hacer esto, sí,sí puede.Oye modelo .Toma, hay que borrar el registro 4 de la tabla de alumnos.

>Modelo: Esta bien controlador, lo hago,Bien copntrolador aquí esta la infromacion 

>Controlador : Gracias modelo , oye vista , toma la infromaciópn nueva de los alumnos

>Vista : Oh grcias controlador,se lo muestro al usuario

![UML](https://cdncontribute.geeksforgeeks.org/wp-content/uploads/MVC-Design-Pattern.png)
![UML2](https://i.stack.imgur.com/a4UfP.gif)

## **Objetivos**

El objetivo de este patron de arquitectura no otro mas que separar las reponsivilidades de la aplicación.

## **MVP**

- Model
- View
- Presenter

[SUPER](https://www.ecodeup.com/patrones-de-diseno-en-java-mvc-dao-y-dto/)