package br.com.luahr.unitins.model

import java.math.BigDecimal

data class Produto(
        val nome: String,
        val descricao: String,
        val valor: BigDecimal
)
