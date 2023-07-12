
# Curso Java Orientado a Objetos

Oracle ONE - Alura
- Parte 1
- Parte 2
- Parte 3
- Parte 4
- Parte 5
- Parte 6 {#parte-6}

### Parte 1: Primeros pasos

### Parte 2: Orientación a Objetos

### Parte 3: Polimorfismo - Herencias e Interfaces

### Parte 4: Excepciones

### Parte 5: Object y String

### Parte 6: Colecciones, Wrappers y Lambda expressions {#parte-6}

1) **Arrays**
Guardan referencias a la memoria HEAP.
Los Array necesitan definirse con un tipo y capacidad.
Pueden ser instanciados con su contenido de manera rápida.

```
int[] lista = new int[10]; // instancia un array "vacio" de 10 posiciones
int[] lista2 = {1,2,3,4,5}; // instancia un array con esos elementos
```

Se pueden declarar de tipo genérico (Object[]), pero al momento de utilizar métodos de uno de los elementos, es necesario hacer un cast.

```
Cliente refCliente = (Cliente) lista[2];
System.out.println(refCliente.getNombre());
```

---
2) **Guardando referencias**
---
3) **ArrayList y Generics**

ArrayList tiene todos los métodos necesarios para trabajar con Arrays. List es una interface (implementa Collection), la cual es implementada por:

 1. ArrayList
 2. LinkedList: Contiene referencias para el nodo anterior y siguiente.
     Tiene un coste de rendimiento superior a un array.
 3. Vector: Es Thread Safe, tiene una sola instancia en memoria,
     todas las pilas de ejecución que pasan por ella lo hacen de a una,
     lo que supone un coste en rendimiento muy alto. 

Puede ser declarado con o sin Generics (un tipo):

```
ArrayList lista = new ArrayList();
ArrayList<Cliente> lista = new ArrayList<>();
```
Los Generics `<>` se utilizan para designar el tipo de Objeto a utilizar.

---
4) **Equals** - *comparaciones de objetos*
Métodos de comparación.
    
1. equals: se hereda de Object.
2. contains: metodo de ArrayList.
3. compareTo: implementación de Comparable.

Si queremos confirmar si un elemento se encuentra en una List podemos utilizar el método `contains`. Este método utiliza el método `equals` del objeto pasado como parámetro. Si el elemento no tiene una sobreescritura de `equals`, se comparará utilizando la dirección en memoria. Por lo tanto una sobreescritura de ese método es algo muy util.

---
5) **Vectores e interfaz Collection**
---
6) **Wrappers** - *autoboxing & unboxing*
Por ejemplo, el metodo .add() acepta como argumento objetos. Al momento de recibir un primitivo como `int` ocurre el **autoboxing**, encapsula el valor en un objeto, en ese caso `Integer`.

Cuando hacemos esto: `lista.add(numero);`

Es similar a esto: `lista.add(new Integer(numero)); // deprecado`

`Integer` es un tipo de objeto llamado **wrapper**, estos contienen el valor de la variable primitiva y varios métodos para poder castear ese valor a otros tipos primitivos compatibles. 

También existe el **unboxing**. Cuando asignamos un "primitivo objeto" a una variable se produce un **unboxing**, en vez de referenciar al objeto, se toma el valor del mismo.

`Integer primitivoObjeto = Integer.valueOf(30); // Esta declaración es un Boxing`

Al declarar la variable de esa manera, tenemos accesso a los métodos que se utilizan para el *unboxing*.

```
int intValue = primitivoObjeto.intValue();
byte byteValue = primitivoObjeto.byteValue();
double doubleValue = primitivoObjeto.doubleValue();
```
y más información sobre los primitivos:

```
Integer.MAX_VALUE
Integer.MIN_VALUE
Integer.SIZE
Integer.BYTES
```

---
7) **Ordenando listas**

Utilizando distintas formas para ordenar listas.

 1. Collections.sort() & Comparable<T> (forma antigua aún utilizada)
 2. List.sort() & Comparator<T> (java ^8)

**Collections.sort()** recibe una lista de objetos de una clase que extiende de **Comparable**, ya que `sort` necesita el metodo `compareTo` implementado en cada elemento, donde encuentra la lógica de ordenamiento por defecto (orden natural).

Ejemplo:
```
public abstract class Cuenta implements Comparable<Cuenta> {...}

List<Cuenta> lista = new ArrayList<>();

```

Implementando Comparable en la clase Cuenta:

`Collections.sort(lista)`

Forma simplificada, utilizando una **clase anónima**:

```
Collections.sort(lista, new Comparator<Cuenta>() {
   @Override
   public int compare(Cuenta o1, Cuenta o2) {
       return Integer.compare(o1.getAgencia(), o2.getAgencia());
   }
});
```

Utilizando Lambda expressions:

```
Collections.sort(lista, (c1, c2) ->
    Integer.compare(c1.getNumero(), c2.getNumero())
);
```
---

**List.sort()** recibe como argumento una *instancia* que implementa **Comparator**.  

`.sort(Comparator<? super E> c)`

De igual forma que `Collections.sort()`, `List.sort()` utiliza un método llamado `compare` con la lógica de ordenamiento.

> Comparator es una **Interfaz Funcional**. Las interfaces funcionales son aquellas que tienen un solo metodo para implementar. Ese método puede ser "default", y puede definirse en la misma Interface.

Podemos crear estas clases con el método sobreescrito:

```
class OrdenadorPorNumero implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        return Integer.compare(o1.getNumero(), o2.getNumero());
    }
}
```
Y realizar el ordenamiento de esta manera:

```
lista.sort(new OrdenadorPorNumeroDeCuenta());
lista.sort(new OrdenadorPorNombre());
```

O de una manera mas simplificada y lejible utilizando una **clase anónima**:
```
lista.sort(new Comparator<Cuenta>() {
  @Override
  public int compare(Cuenta o1, Cuenta o2) {
      return Integer.compare(o1.getNumero(), o2.getNumero());
  }
});
```

O utilizando **Lambda expressions**:

```
lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));
```

---
8) **Clases anónimas y Lambda expressions**
Las **Clases anónimas** son clases que la JVM crea de forma automatica cuando utilizamos cierta sintaxis simplificada en la que no necesitamos instanciar un objeto para poder utilizar las caracteristicas de la clase/interfaz.

```
lista.sort(new Comparator<Cuenta>() {
  @Override
  public int compare(Cuenta o1, Cuenta o2) {
      return Integer.compare(o1.getNumero(), o2.getNumero());
  }
});
```

Las **Lambda Expressions** ([docs](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html))
son maneras simplificadas de definir lógica creando *métodos anónimos*.<br> En el caso anterior se puede refactorizar al punto de solo enviar como paramentro la lógica que necesita utilizar `sort()` para realizar el ordenamiento:

```
lista.sort((c1, c2) -> {
    return Integer.compare(c1.getNumero(), c2.getNumero())
});
```

Son smimilares a las `arrow functions` de JavaScript.<br>
Necesita argumentos, el operador `->` y la lógica. También se pueden obviar las llaves para definir un scope y la palabra reservada `return` cuándo cuenta con una sola linea de código.

`lista.forEach(cuenta -> System.out.println(cuenta));`

Otra sintaxis es **Lambda con referencia de método** ([docs](https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html)), donde indicamos que lógica ejecutar utilizando como argumento un elemento implicito.

`lista.forEach(System.out::println);`