# Publicar el repositorio y GitHub Pages

## Repositorio

Este paquete es el contenido completo del repositorio propuesto. La conexión disponible durante la elaboración no ofrecía creación de repositorios nuevos, por lo que no se creó un remoto ni se subieron archivos a la cuenta.


Crea `icc-pap-material` vacío en tu cuenta de GitHub. Desde esta carpeta:

```bash
git init
git add .
git commit -m "feat: material completo de Programacion Aplicada"
git branch -M main
git remote add origin https://github.com/PabloT18/icc-pap-material.git
git push -u origin main
```

Si prefieres GitHub CLI y ya tienes sesión iniciada, `gh repo create PabloT18/icc-pap-material --public --source=. --remote=origin --push` crea y sube el repositorio. No combines ambas rutas si el remoto ya existe. Puedes elegir repositorio privado según las condiciones de GitHub Pages de tu cuenta.

## GitHub Pages

En Settings > Pages selecciona GitHub Actions como origen. El workflow incluido publica los HTML y recursos del repositorio. Para una cuenta y nombre como los indicados, la dirección habitual será `https://pablot18.github.io/icc-pap-material/` después de una publicación exitosa. No se presenta esa dirección como una página ya publicada.

## Actualizar el HTML

```bash
node scripts/build-site.mjs
node scripts/check-links.mjs
```

El generador lee los MD existentes. Después revisa en navegador y confirma los cambios. Los PPTX son editables; cuando cambias conceptos o código en el MD, actualiza las diapositivas correspondientes antes de publicar.

## Restricciones de las PL

`assets/js/protection.js` bloquea selección, copia, menú contextual y algunos atajos solo dentro de las guías PL. El atributo `data-protected="false"` desactiva el comportamiento en una guía. No hay promesa de impedir capturas, inspección del código ni generación mediante IA. Las herramientas de accesibilidad y navegación por teclado deben seguir funcionando; permite selección en controles de entrada.
