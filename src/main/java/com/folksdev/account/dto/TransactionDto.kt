package com.folksdev.account.dto

import com.folksdev.account.model.TransactiontType
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

data class TransactionDto(
        val id: String?,
        val transactionType: TransactiontType? = TransactiontType.INITIAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?
)
