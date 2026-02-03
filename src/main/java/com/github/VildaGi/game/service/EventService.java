package com.github.VildaGi.game.service;

import com.github.VildaGi.game.model.EventStatus;
import com.github.VildaGi.game.model.SimpleEvent;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class EventService {
    private final List<SimpleEvent> eventList = new ArrayList<>();

    public String getEvents() {
        return printEvents(eventList);
    }

    private String printEvents(List<SimpleEvent> eventList) {
        StringBuilder sb = new StringBuilder().append("Список событий: \n");
        eventList.forEach(event -> {
            sb.append("\t").append(event.toString()).append("\n");
        });
        return sb.toString();
    }

    public void addEvent(){
        List<SimpleEvent> listOfRandomEvents = List.of(
                new SimpleEvent(
                        "Описание 1",
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        EventStatus.PROCESSED),
                new SimpleEvent(
                        "Описание 2",
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        EventStatus.PROCESSED),
                new SimpleEvent(
                        "Описание 3",
                        LocalDate.now(),
                        LocalDate.now().plusDays(5),
                        EventStatus.PROCESSED)
        );

        addEvent(listOfRandomEvents.get(new Random().nextInt(0, 3)));
    }

    public void addEvent(SimpleEvent simpleEvent){
        eventList.add(simpleEvent.copy());
    }
}
