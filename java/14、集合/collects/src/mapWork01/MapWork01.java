package mapWork01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapWork01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("emp1", new Emp(1, "zcr", 10000));
        hashMap.put("emp2", new Emp(2, "zsj", 20000));
        hashMap.put("emp3", new Emp(3, "zcx", 30000));
        for (Object key : hashMap.keySet()) {
            Object o = hashMap.get(key);
            if (o instanceof Emp) {
                Emp emp = (Emp) o;
                if (emp.getSal() > 18000) {
                    System.out.println(emp);
                }
            }
        }
        Set set = hashMap.entrySet();
        for (Object entry : set) {
            Map.Entry mapEntry = (Map.Entry) entry;
            Object obj = mapEntry.getValue();
            if (obj instanceof  Emp){
                Emp emp = (Emp) obj;
                if (emp.getSal() > 18000) {
                    System.out.println(emp);
                }
            }
        }
    }
}

class Emp {
    private int id;
    private String name;
    private double sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Emp(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
