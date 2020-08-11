package guru.springframework.msscbeerservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerDto>{

    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
        System.out.println("BeerPageListConstructor");
    }

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}
