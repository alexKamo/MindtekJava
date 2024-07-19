package designPaterns1;

public class InfoParserProxy implements InfoParserInterface{

    InfoParser infoParser;
    @Override
    public void readData() {
        if (infoParser == null) infoParser = new InfoParser();
        infoParser.readData();
    }
}
