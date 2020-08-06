package fr.lyasen.climbing.domaine.properties;

import fr.lyasen.climbing.messageEscalade.Messages;
import fr.lyasen.climbing.messageEscalade.MsgIncludeParams;
import fr.lyasen.climbing.messageEscalade.MsgError;
import fr.lyasen.climbing.messageEscalade.MsgInfo;

public class ConfigurationEscalade {
    private final MsgInfo msgInfo = new Messages();
    private final MsgIncludeParams msgIncludeParams = new Messages();
    private final MsgError msgError = new Messages();

    public MsgInfo getMsgInfo() {
        return msgInfo;
    }

    public MsgIncludeParams getMsgCombination() {
        return msgIncludeParams;
    }

    public MsgError getMsgError() {
        return msgError;
    }
}
