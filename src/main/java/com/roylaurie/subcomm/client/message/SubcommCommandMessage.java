package com.roylaurie.subcomm.client.message;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.roylaurie.subcomm.client.SubcommMessage;

public final class SubcommCommandMessage extends SubcommMessage {
	private static final String NETCHAT_PREFIX = "SEND:CMD";
    private static final Pattern NETCHAT_PATTERN = Pattern.compile(
        "^" + NETCHAT_PREFIX + ":(.*)$"
    );
    
    private final String mCommand;
    
    /**
     * Creates a message object from a single raw netchat message.
     * @param String netchatMessage
     * @return SubcommCommandMessage NULL if the expected pattern doesn't match.
     * @throws IllegalArgumentException If the parameter values are unsupported
     */
    public static SubcommCommandMessage parseNetchatMessage(String netchatMessage) {
        Matcher matcher = NETCHAT_PATTERN.matcher(netchatMessage);
        if (!matcher.find())
            return null;
        
        String command = matcher.group(1);
        if (command == null || command.length() == 0)
            throw new IllegalArgumentException("Message not specified.");
        
        return new SubcommCommandMessage(command);
    }
    
    public SubcommCommandMessage(String command) {
        super(NETCHAT_PREFIX);
        mCommand = command;
    }

    public String getCommand() {
        return mCommand;
    }

    @Override
    public String getNetchatMessage() {
       return createNetchatMessage(mCommand);
    }
}
