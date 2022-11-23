import React from 'react';
import clsx from 'clsx';
import Link from '@docusaurus/Link';
import useDocusaurusContext from '@docusaurus/useDocusaurusContext';
import Layout from '@theme/Layout';
import HomepageFeatures from '@site/src/components/HomepageFeatures';

import styles from './index.module.css';

function HomepageHeader() {
    const {siteConfig} = useDocusaurusContext();
    return (
      <header className={clsx('hero', styles.heroBanner)}>
        <div className="container">
          <h1 className={clsx('hero__title', styles.heroTitle)}>Fabric by Example</h1>
          {/* <p className="hero__subtitle">{siteConfig.tagline}</p> */}
          <br/>
          <div className={styles.buttons}>
            <Link
              className="button button--secondary button--lg"
              to="/docs/intro">
              Get start with Fabric - 5min ⏱️
            </Link>
          </div>
        </div>
        <img src="/img/hero.jpg" className={clsx(styles.heroImage)}></img>
      </header>
    );
}
  
export default function Home() {
  const {siteConfig} = useDocusaurusContext();
  return (
    <Layout
      title={`Fabric by example`}
      description="Description will go into a meta tag in <head />">
      <HomepageHeader />
      <main>
        <HomepageFeatures />
      </main>
    </Layout>
  );
}
