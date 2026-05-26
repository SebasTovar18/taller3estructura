# Parte 1 
La empresa se organizó mediante un árbol binario simple con 7 nodos:
                      Director                                              0
                 /               \
       Departamento A             Departamento B                            1
        /      \                      /        \
      Empleado A1 Empleado A2   Empleado B1  Empleado B2                    2

La raiz es el directos
los nodos internos son los departamentos
y las hojas son los empleados
Nuestra altura del arbol es de 2 contando a partir de la raiz

# Parte 2
Recorridos preorden
el enunciado nos indica lo siguiente: (Raíz → Izquierda → Derecha)
lo cual nos da como resultado lo siguiente:
Director
Departamento A
Empleado A1
Empleado A2
Departamento B
Empleado B1
Empleado B2

Recorridos postorden
el enunciado nos indica lo siguiente: (Izquierda → Derecha → Raíz)
por lo cual se debe de organizar ahora de esta manera 
Empleado A1
Empleado A2
Departamento A
Empleado B1
Empleado B2
Departamento B
Director

DIFERENCIAS:
Nuestros recorridos recorren el arbol de diferente manera el primero iniciando por la raiz y terminando por la derecha (Preorden)
El segundo iniciando por la izquierda y terminando por la raiz (postorden) 
para que funcionaria? el primero funciona perfectamente para indicar la base del arbol y sus hojas, el segundo se enfoca mas en mostrarnos primero las hojas y despues la raiz
