import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const target = path.join(root, 'build/pages');
await fs.mkdir(target, { recursive: true });
const excluded = new Set(['node_modules', '.git', '.gradle', 'build']);
for (const e of await fs.readdir(root, { withFileTypes: true })) {
    if (excluded.has(e.name)) continue;
    await fs.cp(path.join(root, e.name), path.join(target, e.name), { recursive: true, filter: p => !p.split(path.sep).some(v => v === '.gradle' || v === 'node_modules' || v === '.git' || v === 'build') });
}
console.log('Contenido preparado para GitHub Pages.');
