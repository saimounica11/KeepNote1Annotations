package com.stackroute.keepnote;

import com.stackroute.keepnote.model.Note;
import com.stackroute.keepnote.repository.NoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration

public class AppConfig {
    @Bean
    @Scope("prototype")
    public Note note(){

        Note note=new Note();
        return note;
    }
    @Bean
    public NoteRepository noteRepository(){
        return new NoteRepository();

    }

}
