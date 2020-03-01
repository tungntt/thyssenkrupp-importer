package vn.tungnt.study.thyssenkrupp.importer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.CollectionUtils;
import vn.tungnt.study.cdipp.importer.CdippImporterModule;

import java.lang.annotation.Annotation;


@SpringBootApplication
@CdippImporterModule
public class ThyssenkruppImporterApplication {

    private static final Logger LOG = LoggerFactory.getLogger(ThyssenkruppImporterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ThyssenkruppImporterApplication.class, args);
    }

}
