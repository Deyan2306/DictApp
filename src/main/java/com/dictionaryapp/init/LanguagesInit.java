package com.dictionaryapp.init;

import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.model.enums.LanguageName;
import com.dictionaryapp.repo.LanguageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class LanguagesInit implements CommandLineRunner {

    private final LanguageRepository languageRepository;

    public LanguagesInit(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        final boolean languagesAreInitialized = this.languageRepository.count() > 0;

        if (!languagesAreInitialized) {
            List<Language> languages = new ArrayList<>();

            Arrays.stream(LanguageName.values()).forEach(name -> {
                Language language = new Language();
                language.setName(name);
                languages.add(language);
            });

            this.languageRepository.saveAll(languages);
        }
    }
}
