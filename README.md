# Taller-15
Alumno: Carlos torres del rio.

POO Taller 15: S(ingle responsability principle)OLID

Como una de las 5 pautas Solid, elprincipio de responsabilidad unica es dicho de forma coloquial una Guia o reglamento a el estructurado de un buen codigo, dejando información de buenas practicas, recomendaciónes y pautas que noss permitan evitar errores en la estructura de nusetro codigo.

En concreto este gira principalmente alrededor de la idee de que cada clase, ddebe tener un objetivo unico claro, que reduzca en la medida de lo posible la falta de cohesión en el codigo otorgando a cada clase un proposito unico y objetivo.

Actividad 1:
    Se solicita la creación de una clase Libro con metodos relacionados al manejo de la información y se separe la responsabilidad en multiples clases.
    
    Se crearon varias clases con un objetivo en concreto.
        -Clase Datos, con el fin de crear y identificar los datos a tratar en el archivo.
        -Clase Libro se le designo un metodo que sera rellenado con datos dotados por un objeto.
        -Clase Informar se le designo la sobreescritura del metodo y a su vez un constructor para las variables.
        -Clase Main, hecha para presentar el objeto con los datos que seran dados a las variables presentes en Datos. Para dar el mensaje que es mostraron en Libro como si fuera una descri´ción de este.

Actividad 2:

    Se solicita la creación de una clase producto que manege, etiquetas y calculo de precios (Se entiende etiquetas por categorias)
    Se dividen las responsabildiades para aplicar el principio.

    Se crearon multiples clases:
        -Clase producto publica
            -Se le acuño un metodo mostrar
        -Clas datosproducto extendiendo de producto
            -Crea las variables
        -Clase Mensaje
            -Instancia las variables para sean modificadas por un objeto y sobreescribe el mensaje de Producto.
        -Clase Main
            -Inicializa el codigo usando un objeto para mostrar como funciona el mensaje terminado.

Actividad 3:

    Se pide una clase usuario, se solicita servicio de autenticación y validación del servicio
    
    Se dividen las responsabilidades en las clases.

        -Clase Usuario
            -Crea las variables a usar y posee el metodo a sobeescribir.
        -Clase Confirmar.
            -Extiende de usuario, instancia las variables y sobresescribe el mensaje para acuñarlo al objeto posterior.
        -Clase main.
            -Crea el objeto que modifica el mensaje el mensaje.

