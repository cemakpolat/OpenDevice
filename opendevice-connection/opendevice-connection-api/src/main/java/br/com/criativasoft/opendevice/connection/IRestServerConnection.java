package br.com.criativasoft.opendevice.connection;

/**
 * Rest Server Connection
 *
 * @author Ricardo JL Rufino
 * @date 13/09/14.
 */
public interface IRestServerConnection extends ServerConnection {

    void addWebResource(String path);
}
