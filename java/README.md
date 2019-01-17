[Referenicias](https://www.tutorialspoint.com/design_pattern)

# **Patrones de diseño creacionales**

## **Singleton**
Su proposito es asegurar que solo exista un instancia de una clase.Este es patron de diseño mas simple que se puede utilizar al momento del desarrollo de software.
Hay veces en las que necitaremos de una sola instacia de una conexion a una base de datos , ahora imagines que multiples usarios se conecten entonces tendremos multiples conexiones , para facilitar este es mejor crear una sola instacia de esta conexion y que los usarios consuman de esta sola instacia.
### **Implementación :**
Se debe crear una clase SingleObject . Donde su constructor sea privado para que no pueda ser instaciada y debe tener una instacia estatica de si misma .

```java
    public class Singleton{
        private static Singleton obj ;
    }
```