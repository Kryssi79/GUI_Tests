package com.Kryssi.GUI_Test;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.event.input.KeyBindingEvent;
import org.getspout.spoutapi.gui.ScreenType;
import org.getspout.spoutapi.gui.Widget;
import org.getspout.spoutapi.keyboard.BindingExecutionDelegate;
import org.getspout.spoutapi.keyboard.Keyboard;
import org.getspout.spoutapi.player.FileManager;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.yaml.snakeyaml.Yaml;

//import org.spout.api.plugin.Plugin;
import org.getspout.spout.*;
import org.getspout.spoutapi.plugin.*;



public class main extends  JavaPlugin 
{
	
	@Override
	public void onEnable()
	{
        System.out.println("Starte:  GUI Tester  Plugin ...  ");
        
        // Events: 
        getServer().getPluginManager().registerEvents(new KeyListener(this), this);
        System.out.println("  registerEvents  =>  KeyListener  ");
   }
    
   
	@Override
	public void onDisable() 
	{
		System.out.println("beende:   GUI Tester  Plugin ...  ");
	}
	    
	    
}
