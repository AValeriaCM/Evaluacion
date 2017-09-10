/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluación;

import java.util.StringTokenizer;

/**
 *
 * @author Angie Castañeda
 */
public class Respuestas1 {
    
    public String[] resp1 = {
        
        "No. Esta nombrado, pero no conoce sus funciones ni se ha reunido. Esta nombrado, conoce sus funciones pero no se reúne.  Esta nombrado, conoce sus funciones y hay evidencia de las reuniones",
        "No. Verifica las políticas pero no hay evidencia. Verifica las políticas, hay evidencia pero no se implementan correctivos. Verifica las políticas, hay evidencias y se implementan los correctivos",
        "No. Analiza las normas y estándares pero no las difunde. Analiza las normas y estándares de seguridad pero no existe evidencia. Analiza y difunde las normas y estándares y existe evidencia",
        "No. Lidera el proceso de clasificación de archivo, pero no las medidas de seguridad. Lidera el proceso de archivo y las medidas de seguridad pero no tiene claridad en el aspecto. Lidera el proceso de archivo, las medidas de seguridad y tiene claridad de la ley 1621 y la ley 1712",
        "No. Monitorea los cambios en los riesgos pero no tiene la matriz de riesgos. Monitorea los cambios en los riesgos y tiene la matriz de riesgos pero no hay plan de mitigación. Monitorea los riesgos, cuenta con la matriz de riesgos y emite el plan de mitigación",
        "No. Aprueba iniciativas pero no asigna responsabilidades por dependencias y no cuenta con evidencia. Aprueba iniciativas, tiene asignadas responsabilidades por dependencias pero no cuenta con evidencias. Aprueba iniciativas, asigno responsabilidades por dependencias y cuenta con evidencias",
        "No. Promueve la difusión y apoyo a la seguridad de la información en forma esporádica. Promueve la difusión y apoyo a la seguridad de la información regularmente. Promueve la difusión y apoyo a la seguridad de la información continuamente",
        "No. Se desarrollan auditorias en forma esporádica. Se desarrollan auditorías en forma regular. Se desarrolan auditorías de acuerdo a un cronograma y un plan mensual",
        "No. No existe evidencia de los casos presentados. Hay evidencia pero no se estudian los casos para generar políticas. Se estudia y conceptúa los casos presentados y genera políticas para mitigar los impactos",
        "No. Se usa contraseñas pero son fáciles de adivinar y están escritas en sitios visibles. Las contraseñas son robustas pero están siendo compartidas. El manejo de contraseñas es adecuado",
        "No. No existe registro de contraseñas almacenado de forma segura. Las contraseñas se cambian regularmente. La gestión de contraseñas es adecuada",
        "Hay contenido multimedia no autorizado, lesivo para la seguridad de la información y ofensivo para las personas. Hay contenido multimedia no autorizado lesivo para la seguridad de la información. Hay contenido multimedia no autorizado. No existe contenido no autorizado",
        "Si existe y no están autorizados. Existen equipos personales autorizados pero la información no se está descargando de los mismos al término de la jornada. Existe equipos personales autorizados pero la información se descarga diariamente. No existe equipos personales haciendo trabajo institucional",
        "Hay equipos sensibles fuera del domino de Ejército. Algunos equipos no están en la red, la distribución de ip no es adecuada. La mayoría de equipos están en el dominio de Ejército. Los equipos están en el dominio de Ejército en su totalidad",
        "Existen más de 5 redes wifi no autorizadas. Existen menos de 5 redes wifi no autorizadas. Existe una red wifi autorizada. No existen redes wifi de ningún tipo",
        "La configuración es deficiente. La configuración es débil y existen más de dos navegadores. La configuración es fuerte y existe más de un navegador. La configuración es excelente en todos los navegadores",
        "No hay control del uso de los recursos de información. Hay controles, pero son deficientes. Los controles son adecuados pero el uso no es exclusivamente institucional. Los controles son adecuados y el uso es exclusivamente institucional",
        "No se ha realizado el examen. Se realizó un examen hace más de 6 meses. Se realizó un examen hace tres meses. Se realizó un examen cada dos meses",
        "Si. Se presentaron antecedentes hace seis o más. Se presentaron antecedentes hace un año o más. No se han presentado casos hace dos años",
        "No. Cada año. Cada seis meses. Cada dos meses",
        "Si. Hay dos o más investigaciones. Hay una investigación. No",
        "No. Se asignan tarjetas de manejo de documentación, pero de manera no adecuada. Se asignan las tarjetas de manejo de documentación de acuerdo a los cargos, pero no a la necesidad de conocer la información de inteligencia y contrainteligencia. Se asignan las tarjetas de manejo de documentación de acuerdo a los cargos y necesidad de conocer la información de inteligencia y contrainteligencia",
        "No. Existe inventario desactualizado. Existe inventario actualizado hace seis meses. Existe el inventario actualizado a la fecha y se renueva por cambios en el personal",
        "No. Existen, pero están desactualizadas. Existen actas actualizadas hace tres meses. Se realiza la actualización de las actas mensualmente",
        "No. Se dan órdenes verbales del uso de los activos de información. Se dan políticas de uso aceptable de activos de información en la orden del día o semanal. Existe un protocolo de políticas de uso aceptable de los activos de información",
        "No. Se conoce la ley 1621 y la ley 1712 pero no se aplican. Se conoce la ley 1621 y la ley 1712 y se aplica parcialmente. Se conoce la ley 1621 y la ley 1712 y se aplican correctamente",
        "No. Se clasifica la información, pero no de acuerdo al contenido sino al criterio personal. Se clasifica la información de acuerdo al contenido, pero hay documentos que no deberían llevar nivel de clasificación de acuerdo a lo estipulado en el decreto 1070. Se clasifica correctamente a la información según lo estipulado en el Decreto 1070",
        "No hay restricciones para los medios extraíbles. Las restricciones son deficientes, se permite el uso y no hay control de los medios. Las restricciones son buenas, se permite uso restringido y hay control de medios. Las restricciones son excelentes, se permite uso estrictamente necesario y hay control total de medios",
        "No. Algunos equipos tienen bloqueo de USB. Un equipo está autorizado para tener habilitados los puertos USB. Ningún equipo está autorizado para tener habilitados los puertos USB",
        "No. Hay restricciones, pero son deficientes. Hay restricciones, pero son permisivas. Las restricciones son óptimas",
        "Hay más de dos programas no autorizados. Existen dos programas no autorizados instalados. Existe un programa no autorizado. No existen programas no autorizados instalados",
        "No. Se lleva un control, pero es deficiente. Los controles son buenos, pero no detallados. Los controles son óptimos y detallados",
        "No. Un 50% del personal cuenta con correo institucional. Un 75% del personal cuenta con correo institucional. El 100% del personal cuenta con correo institucional",
        "No se utiliza. Se usa muy rara vez. Se usa regularmente. Se utiliza para toda la información ultra secreta, secreta y sensible",
        "No. Algunas veces. Con regularidad. Siempre se usan claves de apertura",
        "No. Olvidan aplicar el cifrado con clave. Algunos archivos se cifran con clave. Todos los archivos se cifran con clave",
        "No. Se evidencia conexiones esporádicas de dispositivos no autorizados. Se observan conexiones autorizadas. No se permite la conexión de ningún dispositivo ajeno a la red",
        "No. Los mecanismos son mínimos. Los mecanismos son adecuados. Los mecanismos son óptimos",
        "No. Se desconocen las políticas para el intercambio de información, pero se aplican medidas mínimas. Se conoce las políticas y se aplican parcialmente. Existe un protocolo para el intercambio de información",
        "No. Se desconoce los acuerdos de confidencialidad, pero se aplican medidas mínimas. Se conocen los acuerdos de confidencialidad y se aplican parcialmente. Se manejan los acuerdos de confidencialidad de manera óptima",
        "No. Existen algunos controles mínimos. Existen controles, pero no son suficientes. Existen suficientes controles",
        "No. Existen algunos controles mínimos. Existen controles, pero no son suficientes. Existen suficientes controles",
        "No. Existen algunos controles mínimos. Existen controles, pero no son suficientes. Existen suficientes controles",
        "No. Se cumple la política en un 50%. Se cumple la política en un 75%. Se cumple la política en un 100%",
        "No. No conocen la ley de archivo y hay inconsistencias en la organización del mismo. Conocen la ley de archivo y tienen organizado el archivo correctamente en un 50%. Conocen la ley de archivo y tienen organizado el archivo correctamente en su totalidad",
        "No. Desconocen que deben organizar el archivo digital según la TRD. Conocen que se debe organizar el archivo digital según TRD, pero no está organizado en su totalidad. Organiza la documentación digital de acuerdo a TRD correctamente",
        "No. Se archiva, pero no sigue las normas de archivo. Se archiva y sigue las normas de archivo, pero presenta fallas. Archiva correctamente la documentación",
        "No. No aplica. Conocen la ley 1621 y el decreto 1070 y algunos documentos están clasificados correctamente. Conocen la ley y el decreto 1070 y los documentos están correctamente clasificados",
        "No. El personal no conoce la ley y no clasifica los documentos de esta forma. Algunos documentos se clasifican según la ley 1712 y el personal conoce la ley. Clasifica correctamente la información y documentos que no son de inteligencia y contrainteligencia"


    };
    
    public String getRespuesta(int posi){
        return resp1[posi];
    }
    
    public String[] separa(String cadena, String separador){
        
        StringTokenizer token = new StringTokenizer(cadena, separador);
        
        String[] aux = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            
            aux[i] = token.nextToken();     //obtiene token
            i++;
        }
        
        return aux;
        
    }
    
    public String[] setRespuesta(int posi){
        String s1 = resp1[posi];
        String [] s2 = separa(s1, ".");
        return s2;
    }
    
}
