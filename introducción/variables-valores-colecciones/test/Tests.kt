import org.junit.Assert.assertTrue
import org.junit.Test

class Test {
    @Test fun `asignar valores a variables`() {
        assertTrue("La variable `name` tiene que contener un nombre", name.isNotEmpty())
    }

    @Test
    fun `combinar variables`() {
        assertTrue("La frase `phrase` tiene que incluír el nombre que has elegido en el paso anterior", phrase.isNotEmpty())
        assertTrue("La frase `phrase` tiene que incluír el nombre que has elegido en el paso anterior", phrase.startsWith("Hoy a venido a clase"))
        assertTrue("La frase `phrase` tiene que incluír el nombre que has elegido en el paso anterior", phrase.endsWith(name) && name.isNotEmpty())
    }
}