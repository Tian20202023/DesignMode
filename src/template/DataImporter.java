package template;

public abstract class DataImporter {
    public void importData(){
        readFile();
        parseData();
        validateData();
        saveData();
    }

    public abstract void readFile();
    public abstract void parseData();
    public abstract void validateData();
    public abstract void saveData();
}
