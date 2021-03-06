package moe.hilaryoi.im;

import moe.hilaryoi.im.event.EventManager;
import moe.hilaryoi.im.standard.Announcer;

import java.io.IOException;

public class RunServer {
	public static void main (String[] args) {

		Server server = new Server ();

		EventManager m = server.getEventManager ();

		m.addListener(new Hangman());
		m.addListener (new Announcer ()); // maybe put in server itself
		m.addListener (new RPS ());

		try {
			server.startServer ();

		}
		catch (IOException e) {
			System.err.println ("Error: Could not start server");
			e.printStackTrace ();
		}
	}
}
