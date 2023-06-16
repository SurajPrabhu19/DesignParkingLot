package repositories;

import java.util.HashMap;
import models.Ticket;

public class TicketRepository {
    private static Long nextId = 0L;
    private static HashMap<Long, Ticket> tickets = new HashMap<>(0, 0);

    public TicketRepository() {
        super();
    }

    public void save(Ticket ticket) {
        tickets.put(nextId++, ticket);
    }

}
