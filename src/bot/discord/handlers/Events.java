package bot.discord.handlers;

import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Events extends ListenerAdapter {
    // event handling tends to get messy pretty quick so we will
    // spread out some of these methods over different files to
    // have nice and structured code

    // automatically triggered when bot is ready
    @Override
    public void onReady(ReadyEvent ready){
        System.out.println("Successfully logged in.");
        System.out.println(ready.getJDA().asBot().getInviteUrl());
    }

    // triggered when you know... we receive a message
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        // don't look at the message if the author of the message is a bot
        // this prevents the bot from replying to itself
        if (event.getAuthor().isBot()) return;
        this.logMessage(event.getMessage());
        TextChannel channel = event.getTextChannel();
        /*
        channel.sendMessage(event.getMessage().getContentDisplay()).queue(sentMessage -> {
            System.out.println("Echoed message back to user");
        });
        */
    }

    private void middleware(Message message){
        // we're going to move the
    }
    private void logMessage(Message message){
        // we want to log different things based on the different
        // places the message could be coming from
        if (message.isFromType(ChannelType.TEXT)) {
            System.out.printf("[Group: %s]<%s>: %s\n",
                message.getGuild().getName(),
                message.getAuthor().getName(),
                message.getContentDisplay()
            );
        }
        else if (message.isFromType(ChannelType.PRIVATE)){
            System.out.printf("[DM]<%s>: %s\n",
                message.getAuthor().getName(),
                message.getContentDisplay()
            );
        }

    }
}
