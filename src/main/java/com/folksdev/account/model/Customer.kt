package com.folksdev.account.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class Customer(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String? = null,

        val name: String?  = null,
        val surname: String?  = null,

        @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
        val account: Set<Account>? = HashSet()
)
