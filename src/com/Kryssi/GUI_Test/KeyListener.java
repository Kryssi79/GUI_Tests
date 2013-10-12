package com.Kryssi.GUI_Test;

// import org.getspout.spout.listeners.InventoryListener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.gui.WidgetAnchor;
import org.getspout.spoutapi.player.*;


public class KeyListener implements Listener 
{

	main m_plugin;
	SpoutPlayer spoutPlayer;
	
	public KeyListener(main plugin) 
	{
		this.m_plugin = plugin;
	}

	
	@EventHandler(priority=EventPriority.NORMAL )
	public void onPlayerInteractEvent(PlayerInteractEvent event)
	{
		Player player = event.getPlayer();
		System.out.println(" Player Interact Event  ...  ");
		// spoutPlayer = (SpoutPlayer)event.getPlayer();
		spoutPlayer = SpoutManager.getPlayer(player);
		setLabel();
	}
	
	void setLabel()
	{
		GenericPopup somePopup = new GenericPopup();
		GenericLabel label = new GenericLabel(" ... This is a Label  ... ");
		label.setAlign(WidgetAnchor.TOP_CENTER).setAnchor(WidgetAnchor.TOP_CENTER);
		label.setTooltip(" hallo, bin ein Label");
		somePopup.attachWidget(m_plugin, label);
		spoutPlayer.getMainScreen().attachPopupScreen(somePopup);
		System.out.println(" setLabel()  ENDe  ...  ");
	}

}
