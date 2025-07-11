package SimpleFactory;

public class NvwaFactory {
    Person createPerson(String type){
        if("Man".equalsIgnoreCase(type)){
            System.out.println("Nvwa creates M:");
            return new Man();
        }
        else if("Woman".equalsIgnoreCase(type)){
            System.out.println("Nvwa creates W:");
            return new Woman();
        }
        else if("Robot".equalsIgnoreCase(type)){
            System.out.println("Nvwa creates R:");
            return new Robot();
        }
        else{
            System.out.println("Nvwa creates X::");
            System.out.println("未知类型，无法造出该对象。");
            return null;
        }
    }
}
