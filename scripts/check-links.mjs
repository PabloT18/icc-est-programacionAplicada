import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
async function walk(dir) { let out = []; for (const e of await fs.readdir(dir, { withFileTypes: true })) { if (['node_modules', '.git', '.gradle', 'build'].includes(e.name)) continue; const p = path.join(dir, e.name); if (e.isDirectory()) out.push(...await walk(p)); else out.push(p); } return out; }
const errors = []; let checked = 0;
for (const p of await walk(root)) {
  if (!/\.html$/.test(p)) continue;
  const text = await fs.readFile(p, 'utf8');
  for (const m of text.matchAll(/(?:href|src)="([^"#]+)(?:#[^"]*)?"/g)) {
    const link = m[1]; if (/^(?:https?:|mailto:|data:|javascript:)/.test(link)) continue;
    const target = path.resolve(path.dirname(p), decodeURIComponent(link.split(/[?#]/)[0]));
    checked++;
    try { await fs.access(target); } catch { errors.push(path.relative(root, p) + ' -> ' + link); }
  }
}
if (errors.length) { console.error(errors.join('\n')); process.exitCode = 1; }
else console.log(`Enlaces locales correctos: ${checked}`);
