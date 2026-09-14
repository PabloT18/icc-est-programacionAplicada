package edu.ups.pap.u04;
import java.beans.*;
import java.lang.reflect.*;
import java.util.*;
public class BeansDemo {
    public static class SensorBean {
        private String id;
        private String ubicacion;
        public SensorBean() {}
        public String getId(){return id;}
        public void setId(String id){
            if(id==null || id.isBlank()) throw new IllegalArgumentException("ID requerido");
            this.id=id;
        }
        public String getUbicacion(){return ubicacion;}
        public void setUbicacion(String ubicacion){
            if(ubicacion==null || ubicacion.isBlank()) throw new IllegalArgumentException("Ubicación requerida");
            this.ubicacion=ubicacion;
        }
    }
    public static void main(String[] args) throws IntrospectionException, ReflectiveOperationException {
        SensorBean bean = new SensorBean();bean.setId("S01");bean.setUbicacion("Lab");
        var propiedades = Introspector.getBeanInfo(SensorBean.class,Object.class).getPropertyDescriptors();
        Arrays.sort(propiedades,Comparator.comparing(PropertyDescriptor::getName));
        for(var p:propiedades) System.out.println(p.getName()+"="+p.getReadMethod().invoke(bean));
    }
}
