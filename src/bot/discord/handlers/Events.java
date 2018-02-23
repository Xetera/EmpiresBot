package bot.discord.handlers;

import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Events extends ListenerAdapter {
    // event handling tends to get messy pretty quick so we will
    // spread out some of these methods over different files to
    // have nice and structured code

    @Override
    public void onReady(ReadyEvent ready){
        System.out.println("Successfully logged in.");
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        if (event.getAuthor().isBot()) return;
        System.out.println("Received a message.");
        TextChannel channel = event.getTextChannel();
        channel.sendMessage(event.getMessage().getContentDisplay()).queue(sentMessage -> {
            System.out.println("Echoed message back to user");
        });
    }
}
