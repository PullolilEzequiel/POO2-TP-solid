# Banco y Préstamos

Un banco tiene un conjunto de clientes, de los cuales se conocen su nombre, apellido, dirección, edad, sueldo neto mensual y, a partir de este último, su sueldo neto anual. El banco tiene registrados a todos sus clientes y puede agregar nuevos.

Un cliente puede solicitar al banco que le otorgue un crédito por una determinada suma de dinero, la cual devolverá posteriormente a la entidad mediante cuotas mensuales en un determinado plazo de tiempo.

El banco no otorga un crédito de forma inmediata, sino que primero registra una **Solicitud de Crédito** realizada por el cliente y, posteriormente, la evalúa para determinar si la misma es aceptada o rechazada. En caso de ser aceptada, el banco desembolsará y otorgará al cliente el monto en efectivo que ha solicitado.

Existen dos tipos de solicitudes de crédito:
- Créditos personales
- Créditos hipotecarios

Tanto los datos a registrar como la evaluación de una solicitud dependen del tipo que se trate. No obstante, es muy importante recalcar que el banco mantiene a todas las solicitudes juntas, sin discriminar por su tipo.

A continuación se describen los detalles a considerar para ambos tipos de solicitudes, tanto en el momento de agregar una nueva solicitud como en el momento de evaluarla.

---

## Solicitudes de Crédito (en general)

- Al agregar una nueva solicitud de crédito al banco, se indica:
    - Cliente que la solicita
    - Monto solicitado
    - Plazo en meses

- El monto de la cuota mensual se obtiene dividiendo el monto solicitado por la cantidad de cuotas (considerando que se abona una cuota por mes).

- A todas las solicitudes se les puede realizar un **chequeo de aceptación**, el cual depende del tipo de solicitud.

---

## Solicitudes de Crédito Personal

- Requisitos:
    - Ingresos anuales mínimos: **$15.000**
    - El monto de la cuota no debe superar el **70%** de los ingresos mensuales.

---

## Solicitudes de Crédito Hipotecario

Al agregar una solicitud hipotecaria, se indica además:
- Propiedad en garantía, con:
    - Descripción breve
    - Dirección
    - Valor fiscal

Requisitos de aceptación:
- La cuota no debe superar el **50%** de los ingresos mensuales.
- El monto solicitado no puede superar el **70%** del valor fiscal de la propiedad.
- El cliente no debe superar los **65 años de edad** antes de terminar de pagar el crédito.

---

# Sistema Informático

Desde la gerencia se solicita implementar un sistema que permita al banco, entre otras cosas:
- Agregar nuevos clientes al banco.
- Agregar nuevas solicitudes de crédito.
- Calcular el monto total de dinero a desembolsar, obtenido como la sumatoria del monto solicitado de todas las solicitudes aceptables.

---

## Puntos a Realizar

1. **Diagrama de Clases UML**
    - Identificar las clases que forman parte del sistema.
    - Definir atributos y operaciones.
    - Establecer relaciones entre ellas.
    - Distribuir responsabilidades de acuerdo con los objetivos.

2. **Justificación respecto a SOLID**
    - Explicar por qué el modelo no viola los principios SOLID.
    - Señalar las decisiones de diseño tomadas para garantizarlo.

3. **Implementación en Java con TDD**
    - A partir del diseño anterior, realizar la implementación usando **Test Driven Development**.  
