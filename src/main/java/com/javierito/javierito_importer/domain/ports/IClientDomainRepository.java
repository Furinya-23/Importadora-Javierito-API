package com.javierito.javierito_importer.domain.ports;

import com.javierito.javierito_importer.domain.models.Client;
import com.javierito.javierito_importer.domain.models.ClientModels.ListClients;
import com.javierito.javierito_importer.domain.models.ClientModels.NewClient;

import java.util.List;

public interface IClientDomainRepository {

    Client createClient(Client client);
    void removeClient(Client client);

    boolean insertClient(NewClient client);
    List<ListClients> getClient(String ci);
}
