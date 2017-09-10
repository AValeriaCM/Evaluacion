/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación;

import javax.swing.JFrame;

/**
 *
 * @author Angie Castañeda
 */
public class Preguntas1 extends JFrame {
    
    public String[] preg1 = {
      
        "<html>1.1. Se encuentra nombrado por orden semanal el comité de seguridad de información",
        "<html>1.2. Verifica que la Política de Seguridad de Información cuente con los estándares, procedimientos, medidas de implementación, monitoreo y control necesarios para su desarrollo dentro de la unidad",
        "<html>1.3. Analiza y difunde las normas y estándares de seguridad de la información establecidos para el Ejército Nacional a los miembros pertenecientes a la Unidad",
        "<html>1.4. Lidera el proceso de clasificación y archivo, así como las medidas de seguridad para la información clasificada y/o sensible",
        "<html>1.5. Monitorea cambios significativos en los riesgos que afectan a los recursos de la información de la Unidad",
        "<html>1.6. Aprueba iniciativas para incrementar la seguridad de la información, de acuerdo a las competencias y responsabilidades asignadas a cada sección de la Unidad.",
        "<html>1.7. Promueve la difusión y apoyo a la seguridad de la información dentro de la Unidad y dar continuidad a dichas actividades.",
        "<html>1.8. Desarrolla planes de auditoría interna para evaluar los niveles de aplicabilidad de la seguridad de la información en todos sus ámbitos",
        "<html>1.9. Estudia y conceptúa los casos especiales de seguridad de la información presentados en la unidad",
        "<html>2.1 Las contraseñas son lo suficientemente robustas",
        "<html>2.2. La gestión de contraseñas es adecuada",
        "<html>2.3. Existe contenido no autrizado en los equipos de cómputo institucionales",
        "<html>2.4. Existe equipos personales haciendo trabajo y manejando información institucional",
        "<html>2.5. Los equipos están en el dominio de Ejército",
        "<html>2.6. Existen conexiones WiFi no autorizadas no necesarias para el desarrollo de las labores diarias",
        "<html>2.7. Los navegadores estan configurados para que el historial sea borrado cada vez que se cierre",
        "<html>2.8. El uso de los recursos de información es adecuado y para labores institucionales",
        "<html>3.1. El comité de Segurdad de Informacion ha desarrollado el examen de conocimiento de las políticas de seguridad de información a los funcionarios de la unidad",
        "<html>3.2. Hay antecedentes de fuga de información",
        "<html>3.3. Existe capacitación de seguridad de la información",
        "<html>3.4. Existen investigaciones disciplinarias por fuga, robo o pérdida de información",
        "<html>3.5. Se asignan las tarjetas de manejo de documentación de acuerdo a la clasificación de la información establecida en el Decreto 1070",
        "<html>4.1. Existe el Inventario de activos",
        "<html>4.2. Existen actas de asignacion de los activos de información",
        "<html>4.3. Existe una política de uso aceptable de los activos de información",
        "<html>4.4. Existen directrices de clasificación de la información",
        "<html>4.5. Se esta clasificando la información de inteligencia y contrainteligencia de acuerdo al Decreto 1070",
        "<html>4.6. Existe mecanismos de control de medios extraíbles",
        "<html>5.1. Los equipos de cómputo tienen activado el bloqueo de puertos USB",
        "<html>5.2. El acceso a internet esta restringido de acuerdo a las políticas de seguridad de la información",
        "<html>5.3. Existen programas no autorizados que causen brechas de seguridad",
        "<html>5.4. Existe registro detallado del acceso a información clasificada y/o sensible",
        "<html>5.5. Existe acceso a correo institucional para transmitir información clasificada y/o sensible",
        "<html>6.1. Se utiliza el código criptográfico para transferir información clasificada y/o sensible",
        "<html>6.2. La información sensible se envía con clave de archivo al ser transmitida por correo electrónico",
        "<html>6.3. Los archivos digitales de la información sensible y/o clasificada estan cifrados con clave",
        "<html>7.1. Existen controles para evitar la conexión de dispositivos no autorizados a la red",
        "<html>7.2. Existen mecanismos de seguridad asociados a la transmisión de información via radial, celular o cualquier otro medio",
        "<html>7.3. Existen políticas para el intercambio de información sensible y/o clasificada",
        "<html>7.4. Se esta manejando adecuadamente los mecanismos de acuerdos de confidencilaidad de la información",
        "<html>8.1. El perímetro de seguridad física es el adecuado",
        "<html>8.2. Existe controles para las amenazas externas y ambientales",
        "<html>8.3. Existe controles para la salida y entrada de activos de información",
        "<html>8.4. Se cumple con la política de escritorio despejado, pantallas limpias y bloqueo de sesión",
        "<html>9.1. Se cumple con la norma relativa al archivo",
        "<html>9.2. La organización del archivo digital corresponde a la TRD de cada dependencia",
        "<html>9.3. La documentación clasificada y/o sensible esta siendo archivada  siguiendo los protocolos de control para estos documentos de acuerdo a su contenido",
        "<html>10.1. La información de inteligencia y contrainteligencia se esta clasificando según lo estipulado en la ley 1621 de 2013 y Decreto 1070 de 2015",
        "<html>10.2. La información que no es de inteligencia y contrainteligencia se esta clasificando de acuerdo a la ley 1712 de 2012"

    };
    
    public String getPregunta(int posi){
        return preg1[posi];
    }
    

}
