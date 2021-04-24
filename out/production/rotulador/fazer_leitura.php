<?php

    echo("Programa teste em PHP...")

    function calcularSoma($valor1, $valor2) {
        $valor3 = $valor1 + 2;
        return $valor3;
    }

    function calcularMultiplicacao($valor1, $valor2) {
        $result = $valor1 * 2;
        return $result;
    }

    $resultado = calcularSoma(1, 2);

    for ($x = 0; x <= $resultado; $x++) {

       if ($x > 1) {
         print($resultado);
       }
    }

?>