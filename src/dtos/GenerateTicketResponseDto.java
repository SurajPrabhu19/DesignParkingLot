package dtos;

import models.Ticket;

public class GenerateTicketResponseDto {
    private Ticket ticket;
    private ResponseStatusDto status;

    public ResponseStatusDto getStatus() {
        return status;
    }

    public void setStatus(ResponseStatusDto status) {
        this.status = status;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

}
