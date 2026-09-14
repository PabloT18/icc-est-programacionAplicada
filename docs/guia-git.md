# Commits y evidencias

Un repositorio personal conserva el proyecto de toda la materia. Cada actividad agrega una capacidad sin borrar las anteriores. No se solicita fabricar commits vacíos ni dividir artificialmente un cambio terminado.

## Inicio

```bash
git init
git add .
git commit -m "chore: iniciar CampusMonitor"
git branch -M main
```

Crea tu repositorio remoto personal y agrega su URL real con `git remote add origin URL`. Después ejecuta `git push -u origin main`.

## Convención

| Tipo | Uso | Ejemplo |
|---|---|---|
| feat | Capacidad nueva | `feat(pc1.1a): agregar lecturas tipadas` |
| fix | Corrección comprobada | `fix(pc3.4): liberar consumidores al cancelar` |
| docs | Evidencia o explicación | `docs(pl4.1): registrar prueba de rollback` |
| refactor | Cambio interno preservando comportamiento | `refactor(pc1.4): extraer repositorio generico` |
| test | Comprobaciones ejecutables | `test(pl2.1): agregar casos de tramas invalidas` |

Una PC requiere al menos un commit funcional identificable. Una PL debe mostrar avances por sus tres fases. La cantidad no reemplaza la calidad del cambio.

## Enlace a una entrega concreta

```bash
git log --oneline --decorate -10
git rev-parse HEAD
git show --stat HASH_REAL
```

El enlace tiene la forma `https://github.com/USUARIO/REPOSITORIO/commit/HASH_REAL`. Sustituye esos valores con los del repositorio. Se revisa el estado de ese commit, aunque después continúes con otras actividades. No se proporcionan hashes ficticios en este material.

En tu README agrega una fila por PC o PL con el cambio, enlace al commit y archivo de evidencia. Cuando la evidencia se escribe después del commit funcional, puede agregarse en un commit docs posterior que cite ese hash.

## Entrega

Entrega enlace al repositorio accesible para revisión, enlace al commit solicitado y evidencia Markdown. La PL también exige su presentación de solución y los archivos de datos o montaje indicados. No subas contraseñas ni archivos compilados.
