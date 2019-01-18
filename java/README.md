[Referenicias](https://www.tutorialspoint.com/design_pattern)

# **Patrones de diseño creacionales**
Se centrar en automatizar los problemas al crear instacias de las clases de nuestra aplicacion.
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

### PLUS(Control de doble bloqueo) : 
> Este es un patron de diseño utilizado para reducir la sobrecarga de adquirir un bloqueo al probar el criterio del bloqueo<br>
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

```java
    
```