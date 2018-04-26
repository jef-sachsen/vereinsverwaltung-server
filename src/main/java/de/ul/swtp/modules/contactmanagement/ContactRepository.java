package de.ul.swtp.modules.contactmanagement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    Page<Contact> findAllByIdIn(List<Long> ids, Pageable pageable);

    Page<Contact> findAllByGroups(Group group, Pageable pageable);
}
