package by.epam.stone.controller;

public enum RequestParameterName {

    COMMAND_NAME("command"),
    STONES("stones"),
    FILE_NAME("filename");
    
    private String parameter;
    
    RequestParameterName(String parameter){
        this.parameter = parameter;
    }
    
    public String getParameter(){
        return parameter;
    }
}
